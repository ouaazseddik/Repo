package com.sample.test.demo.tests;

import Pages.PizzaOrder;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.sample.test.demo.TestBase;

public class DemoTest extends TestBase {
    @Test
    //Happy path
    //Order A Small 6 slices pizza no Toppings
    //select a Pizza on the dropdown menu
    //enter the quantity
    //enter the name
    //enter email
    //enter phone number
    // choose payment credit card
    // click the button submit
    public void SubmitPizzaOrderCreditCard() {
        //Creating object of PizzaOrder
        PizzaOrder pizza = new PizzaOrder(driver);
        pizza.SelectPizza(1);
        pizza.enterPizzaQuantity(1);
        pizza.EnterName("jhon");
        pizza.EnterEmail("email@domain.com");
        pizza.EnterPhoneNumber("201-000 1111");
        pizza.PaymentCreditCard();
        pizza.SubmitOrder();
        }
   @Test
    //Happy path
   //Order A Small 6 slices pizza 1 Toppings
   //select a Pizza on the dropdown menu
   //select a toppings1 on the dropdown menu
   //enter the quantity
   //enter the name
   //enter email
   //enter phone number
   // choose payment cash on pick up
   // click the button submit
    public void SubmitPizzaOrderCashPickUp() {
        //Creating object of PizzaOrder
        PizzaOrder pizza = new PizzaOrder(driver);
        pizza.SelectPizza(2);
        pizza.SelectToppings1(2);
        pizza.enterPizzaQuantity(1);
        pizza.EnterName("jhon");
        pizza.EnterEmail("email@domain.com");
        pizza.EnterPhoneNumber("201-000 1111");
        pizza.PaymentCashPickUp();
        pizza.SubmitOrder();
    }
   @Test
   //submit an order with just name and phone number with 0 value
   //enter the name
   //enter phone number


   public void  ASubmitPizzaOrderNameAndPhone() {
        //Creating object of PizzaOrder
        PizzaOrder pizza = new PizzaOrder(driver);
        pizza.EnterName("0");
        pizza.EnterPhoneNumber("0");
        pizza.SubmitOrder();
        pizza.AlertDialog();
        Assert.assertEquals(pizza.AlertDialog(),"Name and Phone Number Shouldnt be 0");

    }

}






