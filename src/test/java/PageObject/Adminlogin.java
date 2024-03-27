package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminlogin extends Baseclass
{
WebDriver driver;
public Adminlogin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//input[@id='email']")
WebElement email;
@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//input[@id='remember']")
WebElement rememberme;
@FindBy(xpath="//button[normalize-space()='Sign In']")
WebElement signin;
@FindBy(xpath="//*[@id=\"menu-button\"]/span")
WebElement drpdown;
@FindBy(xpath="//button[normalize-space()='Log out']")
WebElement logout;
public void email(String efield)
{
email.sendKeys(efield);
}
public void pwd(String pwdfield)
{
password.sendKeys(pwdfield);
}
public void remember()
{
rememberme.click();
}
public void signinbutton()
{
signin.click();
}
public void drop()
{
drpdown.click();
}
public void logoutbutton()
{
logout.click();
}
}
