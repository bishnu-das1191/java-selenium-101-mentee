package com.ui.pages;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BrowserUtility {
    private static final By SIGN_IN_LINK = By.xpath("//a[contains(text(),'Sign in')]");

    public HomePage(WebDriver driver) {
        super(driver);
        goToWebsite("http://www.automationpractice.pl");
    }

    public HomePage(String browserName) {
        super(browserName);
        goToWebsite("http://www.automationpractice.pl");
    }

    public HomePage(Browser browser) {
        super(browser);
        goToWebsite(readProperty(QA, "URL"));
    }



    public LoginPage gotToLoginPage(){
        clickOn(SIGN_IN_LINK);
        return new LoginPage(getDriver());
    }



}
