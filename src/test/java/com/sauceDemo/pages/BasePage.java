package com.sauceDemo.pages;

import com.sauceDemo.utilitis.Driver;
import org.openqa.selenium.support.PageFactory;

public  abstract class BasePage {
    public  BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
