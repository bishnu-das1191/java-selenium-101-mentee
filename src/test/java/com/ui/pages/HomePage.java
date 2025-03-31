package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BrowserUtility {
    private static final By SIGN_IN_LINK = By.xpath("//a[contains(text(),'Sign in')]");

    public HomePage(WebDriver driver) {
        super(driver);
        goToWebsite("http://www.automationpractice.pl");
    }

    public LoginPage gotToLoginPage(){
        clickOn(SIGN_IN_LINK);
        return new LoginPage(getDriver());
    }



}
