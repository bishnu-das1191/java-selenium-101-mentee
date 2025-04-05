package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BrowserUtility {

    private static final By LOGGEDIN_USERNAME_LOCATOR = By.xpath("//a[@class='account']/span");


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInUserName(){
        String loggedInUserName = getVisibleText(LOGGEDIN_USERNAME_LOCATOR);
        return loggedInUserName;
    }
}
