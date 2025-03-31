package com.ui.tests;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.gotToLoginPage();
        loginPage.doLoginWith("bishnu@xyz.com", "password");
    }

}
