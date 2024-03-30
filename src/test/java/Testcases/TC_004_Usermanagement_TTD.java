package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Usermanagement;
import TestBase.Testbasepage;
import Utilities.DataProviders;

public class TC_004_Usermanagement_TTD extends Testbasepage
{
@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
public void TC_004_Usermanagement_TTD(String Email,String Password,String exp)throws InterruptedException
{
logger.info("***Starting of the TC_004***");
try
{
	Usermanagement um = new Usermanagement(driver);
	um.email(Email);
	um.pwd(Password);
	um.signinbutton();
	um.user();
	um.createuser();
	um.eid(randomString());
	um.username(randomString().toLowerCase());
	um.useremail(randomString()+("@yopmail.com"));
	um.uc();
	Thread.sleep(10000);
	String newUserEmail = um.captureNewUserEmail();
	um.drop();
	Thread.sleep(5000);
	um.logoutbutton();
	um.fpassword();
	um.emaiuserfield();
	um.submit();
	Thread.sleep(10000);
	if(exp.equalsIgnoreCase("Valid"))
	{
	Assert.assertTrue(true);
	}
	else
	{
	Assert.assertFalse(false);
	}
	if(exp.equalsIgnoreCase("Invalid"))
	{
	Assert.assertTrue(false);
	}
	else
	{
	Assert.assertTrue(true);
	}
	}
	catch(Exception e )
	{
	Assert.fail();
	}
	logger.info("***Finish of the TC_002_DDT***");
	}
}
