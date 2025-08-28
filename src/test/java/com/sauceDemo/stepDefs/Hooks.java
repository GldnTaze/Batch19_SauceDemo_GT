package com.sauceDemo.stepDefs;

import com.sauceDemo.utilitis.BrowserUtils;
import com.sauceDemo.utilitis.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public  void beforMethod(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @After
    public void afterMethod(Scenario scenario){
        if (scenario.isFailed()){
         final    byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.waitFor(2);
      //  Driver.closeDriver();

    }
}
