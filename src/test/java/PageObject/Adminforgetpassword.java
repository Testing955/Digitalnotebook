package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.UserEmailStorage;

public class Adminforgetpassword extends Adminlogin
{
WebDriver driver;
public Adminforgetpassword(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[2]/form/a")
WebElement fpwd;
@FindBy(xpath="//input[@name='email']")
WebElement emailfield;
@FindBy(xpath="//button[normalize-space()='Submit']")
WebElement submitbutton;

public void fpassword()
{
fpwd.click();
}
public void emaiuserfield()
{
String userEmail = UserEmailStorage.getUserEmail();
emailfield.sendKeys(userEmail);
}
public void submit()
{
submitbutton.click();
}

}