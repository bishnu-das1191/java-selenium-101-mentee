package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BrowserUtility {

    private static final By EMAIL_TEXT_BOX_LOCATOR = By.xpath("//input[@id='email']");
    private static final By PASSWORD_TEXT_BOX_LOCATOR = By.xpath("//input[@id='passwd']");
    private static final By SIGN_IN_SUBMIT_BUTTON_LOCATOR = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage doLoginWith(String emailToEnter, String passwordToEnter){
        enterText(EMAIL_TEXT_BOX_LOCATOR, emailToEnter);
        enterText(PASSWORD_TEXT_BOX_LOCATOR, passwordToEnter);
        clickOn(SIGN_IN_SUBMIT_BUTTON_LOCATOR);
        return new MyAccountPage(getDriver());
    }


}
