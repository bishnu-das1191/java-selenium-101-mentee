package com.utility;

import com.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class BrowserUtility {

    private WebDriver driver;

    public BrowserUtility(WebDriver driver) {
        this.driver = driver;
    }

    public BrowserUtility(String browserName) {
        if(browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }else{
            System.err.println("Invalid Browser Name!!");
        }
    }


    public BrowserUtility(Browser browserName) {
        if(browserName == Browser.CHROME) {
            driver = new ChromeDriver();
        } else if (browserName == Browser.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browserName == Browser.SAFARI) {
            driver = new SafariDriver();
        }
    }



    public WebDriver getDriver(){
        return driver;
    }

    public void goToWebsite(String url){
        driver.get(url);
    }

    public void clickOn(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void enterText(By locator, String textToEnter){
        WebElement element = driver.findElement(locator);
        element.sendKeys(textToEnter);
    }

    public String getVisibleText(By locator){
        WebElement element = driver.findElement(locator);
       return element.getText();
    }




}
