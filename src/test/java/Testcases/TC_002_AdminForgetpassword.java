package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObject.Adminforgetpassword;
import TestBase.Testbasepage;

public class TC_002_AdminForgetpassword  extends Testbasepage
{
@Test
public void forgetpwd()
{
Adminforgetpassword fpass = new Adminforgetpassword(driver);
fpass.fpassword();
fpass.emaiuserfield();
fpass.submit();
}
@AfterMethod
public void tearDownTest() {
    tearDown();  // Calling the tearDown method from Testbasepage class
}
}
