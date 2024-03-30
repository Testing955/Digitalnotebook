package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObject.Usermanagement;
import TestBase.Testbasepage;

public class TC_003_Usermanagement extends Testbasepage
{
@Test
public void  user() throws InterruptedException
{
Usermanagement um = new Usermanagement(driver);
um.email(p.getProperty("email"));
um.pwd(p.getProperty("password"));
um.signinbutton();
um.user();
um.createuser();
um.eid(randomString());
um.username(randomString().toLowerCase());
um.useremail(randomString()+("@yopmail.com"));
um.uc();
Thread.sleep(10000);
String newUserEmail = um.captureNewUserEmail();
um.updatepro();
um.contact(randomNumeric());
um.selectgender();
um.ue();
um.update();
Thread.sleep(5000);
um.drop();
Thread.sleep(5000);
um.logoutbutton();
um.fpassword();
um.emaiuserfield();
um.submit();
Thread.sleep(10000);
}

@AfterMethod
public void tearDownTest() {
    tearDown();  // Calling the tearDown method from Testbasepage class
}
}
