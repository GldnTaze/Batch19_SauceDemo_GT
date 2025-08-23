package com.sauceDemo.stepDefs;

import com.sauceDemo.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Products_StepDefs {
    ProductsPage productsPage = new ProductsPage();

    @Then("The user should be able to see page title: {string}")
    public void the_user_should_be_able_to_see_page_title(String title) {
        String actualTitle = productsPage.getPageTitle();
        //   String actualTitle2= productsPage.getPageTitle(title);
     Assert. assertEquals(title, actualTitle);
        //    Assert.assertEquals(title,actualTitle2);
    }

    @When("The user should be able to sort items with order type: {string}")
    public void the_user_should_be_able_to_sort_items_with_order_type(String orderType) {
        productsPage.sortItems(orderType);

    }

    @Then("The user verifies the correct order with the first item name: {string}")
    public void the_user_verifies_the_correct_order_with_the_first_item_name(String expectedItem) {
        String actualFirstItem = productsPage.sortedFirstItem();
        Assert.assertEquals(expectedItem, actualFirstItem);

    }

    @When("The user should be able to add item with item name: {string}")
    public void the_user_should_be_able_to_add_item_with_item_name(String itemName) {
        productsPage.addItemWithName(itemName);
    }

    @Then("The number on the basket icon should show added item quantity {int}")
    public void the_number_on_the_basket_icon_should_show_added_item_quantity(Integer expectedNumber) {
        int actualNumber = productsPage.getbasketNumber();
        //  Assert.assertEquals(expectedNumber,actualNumber);

    }

    @When("The user nevigates to your cart page")
    public void the_user_nevigates_to_your_cart_page() {
        productsPage.nevigateToShopingCartPage();
    }
}
