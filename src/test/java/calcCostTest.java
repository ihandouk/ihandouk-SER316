package test.java;

import static org.junit.Assert.assertEquals;
import main.java.Dairy;
import main.java.Cart;


import main.java.FrozenFood;
import main.java.Meat;
import main.java.Produce;
import main.java.UnderAgeException;
import main.java.Alcohol;
import org.junit.Test;


public class calcCostTest {
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


    @org.junit.Before
    public void setUp() throws Exception {

        // all carts should be set up like this

        // cart created with an age 40 shopper
        cart1 = new Cart(40);
        for (int i = 0; i < 2; i++) {
            cart1.addItem(new Alcohol());
        }
        for(int i = 0; i < 3; i++) {
            cart1.addItem(new Dairy());
        }
        for(int i = 0; i < 4; i++) {
            cart1.addItem(new Meat());
        }

        cart1Expected = 65.0;
        
        cart2 = new Cart(18);
        for(int i = 0; i<1; i++) {
        	cart2.addItem(new FrozenFood());
        }
        for(int i = 0; i < 2; i++) {
        	cart2.addItem(new Meat());
        }
        
        cart2Expected = 25;
        
        cart3 = new Cart(21);
        for(int i = 0; i < 3; i++) {
        	cart3.addItem(new Produce());
        }
        for(int i = 0; i<4; i++) {
        	cart3.addItem(new Alcohol());
        }
        for(int i = 0; i < 2; i++) {
        	cart3.addItem(new Meat());
        }
        
        cart3Expected = 58.0;
        
        cart4 = new Cart(40);
        for(int i = 0; i<2; i++) {
        	cart4.addItem(new FrozenFood());
        }
        for(int i = 0; i < 3; i++) {
        	cart4.addItem(new Produce());
        }
        
        cart4Expected = 16.0;
        
        cart5 = new Cart(46);
        for(int i = 0; i < 5; i++) {
        	cart5.addItem(new FrozenFood());
        	cart5.addItem(new Produce());
        }
        for(int i = 0; i < 3; i++) {
        	cart5.addItem(new Meat());
        }
        for(int i = 0; i < 2; i++) {
        	cart5.addItem(new Alcohol());
        }
        for(int i = 0; i < 2; i++) {
        	cart5.addItem(new Dairy());
        }
        for(int i = 0; i < 2; i++) {
        	cart5.addItem(new Produce());
        }
        
        cart5Expected = 91.0;
        
        cart6 = new Cart(25);
        for(int i = 0; i<1; i++) {
        	cart6.addItem(new Dairy());
        }
        for(int i = 0; i < 2; i++) {
        	cart6.addItem(new Alcohol());
        }
        for(int i = 0; i < 3; i++) {
        	cart6.addItem(new Meat());
        }
        
        cart6Expected = 49.0;
        
        cart7 = new Cart(30);
        for(int i = 0; i < 1; i++) {
        	cart7.addItem(new Alcohol());
        }
        for(int i = 0; i < 2; i++) {
        	cart7.addItem(new Meat());
        }
        
        cart7Expected = 28.0;
        
    }
    

    // sample test
    @Test
    public void calcCostCart1() throws UnderAgeException {
        double amount = cart1.calcCost();
        assertEquals(cart1Expected, amount, .01);
    }
    @Test
    public void calcCostCart2() throws UnderAgeException {
        double amount = cart2.calcCost();
        assertEquals(cart2Expected, amount, .01);
    }
    @Test
    public void calcCostCart3() throws UnderAgeException {
        double amount = cart3.calcCost();
        assertEquals(cart3Expected, amount, .01);
    }
    @Test
    public void calcCostCart4() throws UnderAgeException {
        double amount = cart4.calcCost();
        assertEquals(cart4Expected, amount, .01);
    }
    @Test
    public void calcCostCart5() throws UnderAgeException {
        double amount = cart5.calcCost();
        assertEquals(cart5Expected, amount, .01);
    }
    @Test
    public void calcCostCart6() throws UnderAgeException {
        double amount = cart6.calcCost();
        assertEquals(cart6Expected, amount, .01);
    }
    @Test
    public void calcCostCart7() throws UnderAgeException {
        double amount = cart7.calcCost();
        assertEquals(cart7Expected, amount, .01);
    }
}