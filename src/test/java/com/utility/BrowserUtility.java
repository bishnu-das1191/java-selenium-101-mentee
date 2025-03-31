package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtility {

    private WebDriver driver;

    public BrowserUtility(WebDriver driver) {
        this.driver = driver;
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
