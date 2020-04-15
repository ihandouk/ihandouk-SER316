package test.java;

import main.java.*;
import org.junit.Test;
<<<<<<< HEAD

import main.java.Cart;
import static org.junit.Assert.assertEquals; 

public class calcCostTest {
=======
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;

import main.java.Cart;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class calcCostTest {

    private Class<Cart> classUnderTest;

    @SuppressWarnings("unchecked")
    public calcCostTest(Object classUnderTest) {
        this.classUnderTest = (Class<Cart>) classUnderTest;
    }

    // Define all classes to be tested
    @Parameterized.Parameters
    public static Collection<Object[]> cartClassUnderTest() {
        Object[][] classes = {
            {Cart3.class}
        };
        return Arrays.asList(classes);
    }

    private Cart createCart(int age) throws Exception {
        Constructor<Cart> constructor = classUnderTest.getConstructor(Integer.TYPE);
        return constructor.newInstance(age);
    }

>>>>>>> Review
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
<<<<<<< HEAD
        cart1 = new Cart(40);
=======
        cart1 = createCart(40);
>>>>>>> Review
        for (int i = 0; i < 2; i++) {
            cart1.addItem(new Alcohol());
        }
        for(int i = 0; i < 3; i++) {
            cart1.addItem(new Dairy());
        }
        for(int i = 0; i < 4; i++) {
            cart1.addItem(new Meat());
        }

<<<<<<< HEAD
        cart1Expected = 65.0;
        
        cart2 = new Cart(18);
=======
        cart1Expected = 70.2;
        
        cart2 = createCart(18);
>>>>>>> Review
        for(int i = 0; i<1; i++) {
        	cart2.addItem(new FrozenFood());
        }
        for(int i = 0; i<2; i++) {
        	cart2.addItem(new Meat());
        }
        
<<<<<<< HEAD
        cart2Expected = 25;
        
        cart3 = new Cart(21);
=======
        cart2Expected = 27;
        
        cart3 = createCart(21);
>>>>>>> Review
        for(int i = 0; i<3; i++) {
        	cart3.addItem(new Produce());
        }
        for(int i = 0; i<4; i++) {
        	cart3.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart3.addItem(new Meat());
        }
        
<<<<<<< HEAD
        cart3Expected = 58.0;
        
        cart4 = new Cart(40);
=======
        cart3Expected = 61.56;
        
        cart4 = createCart(40);
>>>>>>> Review
        for(int i = 0; i<2; i++) {
        	cart4.addItem(new FrozenFood());
        }
        for(int i = 0; i<3; i++) {
        	cart4.addItem(new Produce());
        }
        
<<<<<<< HEAD
        cart4Expected = 16.0;
        
        cart5 = new Cart(46);
=======
        cart4Expected = 16.2;
        
        cart5 = createCart(46);
>>>>>>> Review
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
        
<<<<<<< HEAD
        cart5Expected = 91.0;
        
        cart6 = new Cart(25);
=======
        cart5Expected = 96.12;
        
        cart6 = createCart(25);
>>>>>>> Review
        for(int i = 0; i<1; i++) {
        	cart6.addItem(new Dairy());
        }
        for(int i = 0; i<2; i++) {
        	cart6.addItem(new Alcohol());
        }
        for(int i = 0; i<3; i++) {
        	cart6.addItem(new Meat());
        }
        
<<<<<<< HEAD
        cart6Expected = 49.0;
        
        cart7 = new Cart(30);
=======
        cart6Expected = 52.92;
        
        cart7 = createCart(30);
>>>>>>> Review
        for(int i = 0; i<1; i++) {
        	cart7.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart7.addItem(new Meat());
        }
        
<<<<<<< HEAD
        cart7Expected = 28.0;
=======
        cart7Expected = 30.24;
>>>>>>> Review
        
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