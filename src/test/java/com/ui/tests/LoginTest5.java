package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest5 {

    @Test(description = "Valid login scenario")
    public void loginTest(){
        HomePage homePage = new HomePage(CHROME);
        Assert.assertEquals(homePage.gotToLoginPage()
                .doLoginWith("bishnu@xyz.com", "password")
                .getLoggedInUserName(), "Bishnu XYZ", "Logged in user name is not as expected");
    }
}
