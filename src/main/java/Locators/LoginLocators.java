package Locators;

import Basepackage.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators extends Baseclass {

@FindBy(id = "username")
    static WebElement usernamebtn;

@FindBy(id = "password")
    static WebElement passwordbtn;

@FindBy(xpath = "//form[@id='loginForm']/div[4]/button")
    static WebElement loginbtn;

    public LoginLocators()
    {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        usernamebtn.sendKeys(username);
        System.out.println("first value"+ usernamebtn.getText());
        passwordbtn.sendKeys(password);
        System.out.println("first value"+ passwordbtn.getText());
        loginbtn.click();

    }

}
