package test.java;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Alcohol;
import main.java.Cart;
import main.java.Dairy;
import main.java.FrozenFood;
import main.java.Meat;
import main.java.Produce;
import main.java.UnderAgeException;


public class CalcCostTest {

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

    /**
     * Test class for Cart.
     * @Before
     */
    @org.junit.Before
    public void setUp() throws Exception {

        // all carts should be set up like this

        // cart created with an age 40 shopper
        cart1 = new Cart(40);
        for (int i = 0; i < 3; i++) {
            cart1.addItem(new Alcohol());
            cart1.addItem(new Dairy());
            cart1.addItem(new Meat());
        }

        cart1Expected = 63.08; //SER316 TASK 2 SPOTBUGS

        cart2 = new Cart(18);
        for (int i = 0; i < 1; i++) {
            cart2.addItem(new FrozenFood());
            cart2.addItem(new Meat());
        }

        cart2Expected = 15.08; //SER316 TASK 2 SPOTBUGS

        cart3 = new Cart(21);
        for (int i = 0; i < 3; i++) {
            cart3.addItem(new Produce());
            cart3.addItem(new Alcohol());
            cart3.addItem(new Meat());
        }

        cart3Expected = 61.08; //SER316 TASK 2 SPOTBUGS

        cart4 = new Cart(40);
        for (int i = 0; i < 2; i++) {
            cart4.addItem(new FrozenFood());
            cart4.addItem(new Produce());
        }

        cart4Expected = 14.08; //SER316 TASK 2 SPOTBUGS

        cart5 = new Cart(46);
        for (int i = 0; i < 5; i++) {
            cart5.addItem(new FrozenFood());
            cart5.addItem(new Produce());
            cart5.addItem(new Meat());
            cart5.addItem(new Alcohol());
            cart5.addItem(new Dairy());
            cart5.addItem(new Produce());
        }

        cart5Expected = 158.08; //SER316 TASK 2 SPOTBUGS

        cart6 = new Cart(25);
        for (int i = 0; i < 1; i++) {
            cart6.addItem(new Dairy());
            cart6.addItem(new Alcohol());
            cart6.addItem(new Meat());
        }

        cart6Expected = 21.08; //SER316 TASK 2 SPOTBUGS

        cart7 = new Cart(30);
        for (int i = 0; i < 1; i++) {
            cart7.addItem(new Alcohol());
            cart7.addItem(new Meat());
        }

        cart7Expected = 18.08; //SER316 TASK 2 SPOTBUGS

    }

    // sample test
    @Test
    public void calcCostcart1() throws UnderAgeException {
        double amount = cart1.calcCost();
        assertEquals(cart1Expected, amount, .01);
    }

    @Test
    public void calcCostcart2() throws UnderAgeException {
        double amount = cart2.calcCost();
        assertEquals(cart2Expected, amount, .01);
    }

    @Test
    public void calcCostcart3() throws UnderAgeException {
        double amount = cart3.calcCost();
        assertEquals(cart3Expected, amount, .01);
    }

    @Test
    public void calcCostcart4() throws UnderAgeException {
        double amount = cart4.calcCost();
        assertEquals(cart4Expected, amount, .01);
    }

    @Test
    public void calcCostcart5() throws UnderAgeException {
        double amount = cart5.calcCost();
        assertEquals(cart5Expected, amount, .01);
    }

    @Test
    public void calcCostcart6() throws UnderAgeException {
        double amount = cart6.calcCost();
        assertEquals(cart6Expected, amount, .01);
    }

    @Test
    public void calcCostcart7() throws UnderAgeException {
        double amount = cart7.calcCost();
        assertEquals(cart7Expected, amount, .01);
    }
}