package com.sauceDemo.pages;

import com.sauceDemo.utilitis.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement pageTitleElement;

    public String getPageTitle() {
        return pageTitleElement.getText();
    }

    public String getPageTitle(String pageTitle) {
        return Driver.get().findElement(By.xpath("//span[text()='"+pageTitle+"']")).getText();
    }
}
