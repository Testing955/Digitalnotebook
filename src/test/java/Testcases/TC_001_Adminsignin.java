package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Adminlogin;
import TestBase.Testbasepage;

public class TC_001_Adminsignin extends Testbasepage
{
@Test
public void signin()
{
logger.info("**Starting of the testcase**");
try
{
Adminlogin al = new Adminlogin(driver);
al.email(p.getProperty("email"));
logger.info("Entering valid email");
al.pwd(p.getProperty("password"));
logger.info("Entering valid password");
al.remember();
al.signinbutton();
logger.info("Clicking on the signin button");
Thread.sleep(10000);
al.drop();
logger.info("Clicking on the dropdown button");
Thread.sleep(5000);
al.logoutbutton();
logger.info("Clicking on the logout button");
}
catch(Exception e)
{
logger.error("test failed");	
Assert.fail();
}
}
}
