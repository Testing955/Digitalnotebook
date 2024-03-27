package Testcases;

import org.testng.annotations.Test;

import PageObject.Adminforgetpassword;
import TestBase.Testbasepage;

public class TC_002AdminForgetpassword  extends Testbasepage
{
@Test
public void forgetpwd()
{
Adminforgetpassword fpass = new Adminforgetpassword(driver);
fpass.fpassword();
fpass.emaiuserfield();
fpass.submit();
}
}
