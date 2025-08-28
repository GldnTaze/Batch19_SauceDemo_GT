package com.sauceDemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{

    @FindBy(tagName = "h2")
    private WebElement succesMessage;

    public String getSuccessMassageText(){
        return succesMessage.getText();
    }
}
