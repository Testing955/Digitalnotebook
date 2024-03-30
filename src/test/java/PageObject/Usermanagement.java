package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.UserEmailStorage;

public class Usermanagement extends Adminforgetpassword
{
WebDriver driver;
public Usermanagement(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div[2]/a")
WebElement usermanagement;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/button")
WebElement create;
@FindBy(xpath="//*[@id=\"employeeID\"]")
WebElement eiduser;
@FindBy(xpath="//*[@id=\"name\"]")
WebElement nameuser;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement emailuser;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/form/button")
WebElement usercreating;
@FindBy(xpath="//table[@class='w-full text-sm text-left']//tbody/tr[1]/td[3]")
WebElement firstUserEmail;
@FindBy(xpath="//table[@class='w-full text-sm text-left']//tbody/tr[1]/td[8]")
WebElement update;
@FindBy(xpath="//*[@id=\"ContactNo\"]")
WebElement contactinfo;
@FindBy(xpath="//select[@id='Gender']//option[@value='Female']")
WebElement gender;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement updateemail;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[8]/div[1]/div/div/div[2]/form/button")
WebElement updateinfo;

public void user()
{
usermanagement.click();
}
public void createuser()
{
create.click();
}
public void  eid(String empid)
{
eiduser.sendKeys(empid);
}
public void  username(String uname)
{
nameuser.sendKeys(uname);
}
public void  useremail(String uemail)
{
emailuser.sendKeys(uemail);
UserEmailStorage.setUserEmail(uemail);
}
public void uc()
{
	usercreating.click();
}
public String captureNewUserEmail() {
    String email = firstUserEmail.getText();
    // Store the email for later use
    UserEmailStorage.setUserEmail(email);
    return email;
}
public void updatepro()
{
update.click();
}
public void contact(String num)
{
contactinfo.sendKeys(num);
}
public void selectgender()
{
gender.click();
}
public void ue()
{
updateemail.clear();
updateemail.sendKeys("princehestabit@gmail.com");
}
public void update()
{
updateinfo.click();
}
}
