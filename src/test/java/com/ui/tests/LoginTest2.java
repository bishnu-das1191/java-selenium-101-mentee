package com.ui.tests;

import com.utility.BrowserUtility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       /* BrowserUtility browserUtility = new BrowserUtility(driver);
        browserUtility.goToWebsite("http://www.automationpractice.pl");

        By signInLinkLocator = By.xpath("//a[contains(text(),'Sign in')]");
        browserUtility.clickOn(signInLinkLocator);

        By emailField = By.xpath("//input[@id='email']");
        browserUtility.enterText(emailField, "bishnu@xyz.com");

        By passwordField = By.xpath("//input[@id='passwd']");
        browserUtility.enterText(passwordField, "password");

        By submitButton = By.id("SubmitLogin");
        browserUtility.clickOn(submitButton);*/


    }
}
