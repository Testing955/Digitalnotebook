package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usermanagement extends Adminlogin
{
WebDriver driver;
public Usermanagement(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div[2]/a")
WebElement usermanagement;
@FindBy(xpath="")
WebElement create;
}
