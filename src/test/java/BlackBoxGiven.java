package test.java;

import main.java.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;

import main.java.Cart;
import main.java.Cart1;
import main.java.Cart2;
import main.java.Cart3;
import main.java.Cart4;
import main.java.Cart5;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BlackBoxGiven {

    private Class<Cart> classUnderTest;

    @SuppressWarnings("unchecked")
    public BlackBoxGiven(Object classUnderTest) {
        this.classUnderTest = (Class<Cart>) classUnderTest;
    }

    // Define all classes to be tested
    @Parameterized.Parameters
    public static Collection<Object[]> cartClassUnderTest() {
        Object[][] classes = {
            {Cart0.class},
            {Cart1.class},
            {Cart2.class},
            {Cart3.class},
            {Cart4.class},
            {Cart5.class}
        };
        return Arrays.asList(classes);
    }

    private Cart createCart(int age) throws Exception {
        Constructor<Cart> constructor = classUnderTest.getConstructor(Integer.TYPE);
        return constructor.newInstance(age);
    }

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
        cart1 = createCart(40);
        for (int i = 0; i < 2; i++) {
            cart1.addItem(new Alcohol());
        }
        for(int i = 0; i < 3; i++) {
            cart1.addItem(new Dairy());
        }
        for(int i = 0; i < 4; i++) {
            cart1.addItem(new Meat());
        }

        cart1Expected = 65;
        
        cart2 = createCart(18);
        for(int i = 0; i<1; i++) {
        	cart2.addItem(new FrozenFood());
        }
        for(int i = 0; i<2; i++) {
        	cart2.addItem(new Meat());
        }
        
        cart2Expected = 25;
        
        cart3 = createCart(21);
        for(int i = 0; i<3; i++) {
        	cart3.addItem(new Produce());
        }
        for(int i = 0; i<4; i++) {
        	cart3.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart3.addItem(new Meat());
        }
        
        cart3Expected = 57;
        
        cart4 = createCart(40);
        for(int i = 0; i<2; i++) {
        	cart4.addItem(new FrozenFood());
        }
        for(int i = 0; i<3; i++) {
        	cart4.addItem(new Produce());
        }
        
        cart4Expected = 15;
        
        cart5 = createCart(46);
        for(int i = 0; i<5; i++) {
        	cart5.addItem(new FrozenFood());
        	cart5.addItem(new Produce());
        }
        for(int i = 0; i<3; i++) {
        	cart5.addItem(new Meat());
        }
        for(int i = 0; i<2; i++) {
        	cart5.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart5.addItem(new Dairy());
        }
        for(int i = 0; i<2; i++) {
        	cart5.addItem(new Produce());
        }
        
        cart5Expected = 83;
        
        cart6 = createCart(25);
        for(int i = 0; i<1; i++) {
        	cart6.addItem(new Dairy());
        }
        for(int i = 0; i<2; i++) {
        	cart6.addItem(new Alcohol());
        }
        for(int i = 0; i<3; i++) {
        	cart6.addItem(new Meat());
        }
        
        cart6Expected = 49;
        
        cart7 = createCart(30);
        for(int i = 0; i<1; i++) {
        	cart7.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart7.addItem(new Meat());
        }
        
        cart7Expected = 28;
        
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