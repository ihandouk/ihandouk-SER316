package test.java;

import static org.junit.Assert.assertEquals;

import main.java.Alcohol;
import main.java.Cart;
import main.java.Dairy;
import main.java.FrozenFood;
import main.java.Meat;
import main.java.Produce;
import main.java.UnderAgeException;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;


public class CartTest {
    // A sample Cart
    Cart cart1;
    Cart cart2;
    Cart cart3;
    Cart cart4;
    Cart cart5;
    Cart cart6;
    Cart cart7;
    double cart1Expected;
    double cart2Expected;
    double cart3Expected;
    double cart4Expected;
    double cart5Expected;
    double cart6Expected;
    double cart7Expected;
    
    // importing Cart class
    main.java.Cart cart;
    
    /**
     * Test class for Cart.
     * @Before
     */
    @Before
    public void setUp() throws Exception {


        cart = new main.java.Cart(45);

        // cart created with an age 40 shopper
        cart1 = new Cart(45);

        for (int i = 0; i < 2; i++) {
            cart1.addItem(new Alcohol());
            cart1.addItem(new Dairy());
            cart1.addItem(new Meat());
        }

        cart1Expected = 0.0; //SER316 TASK 2 SPOTBUGS

        cart2 = new Cart(18);

        for(int i = 0; i < 1; i++) {
            cart2.addItem(new FrozenFood());
            cart2.addItem(new Meat());
        }

        cart2Expected = 0.0; //SER316 TASK 2 SPOTBUGS

        cart3 = new Cart(21);
        for(int i = 0; i < 3; i++) {
            cart3.addItem(new Produce());
            cart3.addItem(new Alcohol());
            cart3.addItem(new Meat());
        }

        cart3Expected = 1.0; //SER316 TASK 2 SPOTBUGS

        cart4 = new Cart(40);
        for(int i = 0; i < 2; i++) {
            cart4.addItem(new FrozenFood());
            cart4.addItem(new Produce());
        }

        cart4Expected = 0.0; //SER316 TASK 2 SPOTBUGS

        cart5 = new Cart(46);
        for(int i = 0; i < 5; i++) {
            cart5.addItem(new FrozenFood());
            cart5.addItem(new Alcohol());
            cart5.addItem(new Dairy());
            cart5.addItem(new Produce());
        }

        cart5Expected = -14.0; //SER316 TASK 2 SPOTBUGS

        cart6 = new Cart(25);
        for(int i = 0; i < 1; i++) {
            cart6.addItem(new Dairy());
            cart6.addItem(new Alcohol());
            cart6.addItem(new Meat());
        }

        cart6Expected = 0.0; //SER316 TASK 2 SPOTBUGS

        cart7 = new Cart(30);
        for(int i = 0; i < 1; i++) {
            cart7.addItem(new Alcohol());
            cart7.addItem(new Meat());
        }

        cart7Expected = 0.0; //SER316 TASK 2 SPOTBUGS

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void emptyCart() throws UnderAgeException {
        assertEquals(0.0, cart.amount_saved(), .01);
    }

    @Test
    public void produce_savings()throws UnderAgeException {
        assertEquals(0.0, cart2.amount_saved(), .01);
        assertEquals(15.0, cart2.calcCost(), .01);

    }

    @Test
    public void taxCheck()throws UnderAgeException {
        assertEquals(0.80, cart7.getTax(10, "AZ"), .01);
        assertEquals(0.90, cart7.getTax(10, "CA"), .01);
        assertEquals(1.0, cart7.getTax(10, "NY"), .01);
        assertEquals(0.70, cart7.getTax(10, "CO"), .01);
        assertEquals(10.0, cart7.getTax(10, "AZf"), .01);
        
    }


    
    // sample test
    @Test
    public void amount_savedcart1() throws UnderAgeException {

        double amount = cart1.amount_saved();
        assertEquals(cart1Expected, amount, .01);
    }

    @Test
    public void amount_savedcart2() throws UnderAgeException {

        double amount = cart2.amount_saved();
        assertEquals(cart2Expected, amount, .01);
    }

    @Test
    public void amount_savedcart3() throws UnderAgeException {

        double amount = cart3.amount_saved();
        assertEquals(cart3Expected, amount, .01);
    }

    @Test
    public void amount_savedcart4() throws UnderAgeException {

        double amount = cart4.amount_saved();
        assertEquals(cart4Expected, amount, .01);
    }

    @Test
    public void amount_savedcart5() throws UnderAgeException {

        double amount = cart5.amount_saved();
        assertEquals(cart5Expected, amount, .01);
    }

    @Test
    public void amount_savedcart6() throws UnderAgeException {
        double amount = cart6.amount_saved();
        assertEquals(cart6Expected, amount, .01);
    }
    
    @Test
    public void amount_savedcart7() throws UnderAgeException {
        double amount = cart7.amount_saved();
        assertEquals(cart7Expected, amount, .01);
    }
} 