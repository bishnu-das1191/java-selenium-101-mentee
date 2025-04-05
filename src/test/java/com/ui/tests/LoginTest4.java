package com.ui.tests;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest4 {

    @Test(description = "Valid login scenario")
    public void loginTest(){
        HomePage homePage = new HomePage("chrome");
        LoginPage loginPage = homePage.gotToLoginPage();
        String usernameInAccountPage = loginPage.doLoginWith("bishnu@xyz.com", "password").getLoggedInUserName();
        System.out.println(usernameInAccountPage);
    }
}
