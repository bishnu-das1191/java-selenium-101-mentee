package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();

        By SingIn = By.xpath("//a[contains(text(),'Sign in')]");
        WebElement signInLinkEle = driver.findElement(SingIn);
        signInLinkEle.click();

        By emailLocator = By.id("email");
        WebElement emailEle = driver.findElement(emailLocator);
        emailEle.sendKeys("bishnu@xyz.com");

        By passwdLocator = By.id("passwd");
        WebElement passwdEle = driver.findElement(passwdLocator);
        passwdEle.sendKeys("password");

        By submitLocator = By.id("SubmitLogin");
        WebElement submitEle = driver.findElement(submitLocator);
        submitEle.click();






    }
}
