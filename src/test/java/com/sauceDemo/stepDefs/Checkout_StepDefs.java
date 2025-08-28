package com.sauceDemo.stepDefs;

import com.sauceDemo.pages.CheckoutCompletePage;
import com.sauceDemo.pages.CheckoutOverviewPage;
import com.sauceDemo.pages.CheckoutYourInformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Checkout_StepDefs {
CheckoutYourInformationPage checkoutYourInformationPage=new CheckoutYourInformationPage();
CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage();
CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage();
    @When("The user fills the your information form with followind data")
    public void the_user_fills_the_your_information_form_with_followind_data(Map<String,String> userData) {

checkoutYourInformationPage.fillYourInformationForm(userData.get("first_name"),
        userData.get("last_name"), userData.get("postal_code"));
    }

    @Then("The user should be able to verify total price with {string}")
    public void the_user_should_be_able_to_verify_total_price_with(String expectedPrice) {
        String actualPrice = checkoutOverviewPage.getTotalPrice();
        Assert.assertEquals(expectedPrice,actualPrice);
    }
    @Then("The user verifies the success shopping message: {string}")
    public void the_user_verifies_the_success_shopping_message(String expextedMessage) {
        String actualMessage = checkoutCompletePage.getSuccessMassageText();
        Assert.assertEquals(expextedMessage,actualMessage);

    }
}
