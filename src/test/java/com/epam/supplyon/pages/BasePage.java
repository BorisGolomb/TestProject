package com.epam.supplyon.pages;

import com.epam.supplyon.service.WebDriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver getDriver(){
        return WebDriverHolder.getInstance();
    }



    public BasePage() {
        PageFactory.initElements(getDriver(), this);

    }


}
