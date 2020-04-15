package test.java;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.*;
<<<<<<< HEAD
import main.java.Produce;
import main.java.Cart;
import static org.junit.Assert.assertEquals;

public class CartTest {


    
=======
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CartTest {

    private Class<Cart> classUnderTest;

    @SuppressWarnings("unchecked")
    public CartTest(Object classUnderTest) {
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

    private Cart newCart(int age) throws Exception {
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
<<<<<<< HEAD
    
    main.java.Cart cart;

    @Before
    public void setUp() throws Exception {
    	cart = new main.java.Cart(45);
        // all carts should be set up like this

        // cart created with an age 40 shopper
        cart1 = new Cart(45);
=======

    @Before
    public void setUp() throws Exception {
        // all carts should be set up like this

        // cart created with an age 40 shopper
        cart1 = newCart(45);
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

        cart1Expected = 0.0;
        
<<<<<<< HEAD
        cart2 = new Cart(18);
=======
        cart2 = newCart(18);
>>>>>>> Review
        for(int i = 0; i<1; i++) {
        	cart2.addItem(new FrozenFood());
        }
        for(int i = 0; i<2; i++) {
        	cart2.addItem(new Meat());
        }
        
        cart2Expected = 0.0;
        
<<<<<<< HEAD
        cart3 = new Cart(21);
=======
        cart3 = newCart(21);
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
        
        cart3Expected = 1.0;
        
<<<<<<< HEAD
        cart4 = new Cart(40);
=======
        cart4 = newCart(40);
>>>>>>> Review
        for(int i = 0; i<2; i++) {
        	cart4.addItem(new FrozenFood());
        }
        for(int i = 0; i<3; i++) {
        	cart4.addItem(new Produce());
        }
        
        cart4Expected = 1.0;
        
<<<<<<< HEAD
        cart5 = new Cart(46);
=======
        cart5 = newCart(46);
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
        
        cart5Expected = -4.0;
        
<<<<<<< HEAD
        cart6 = new Cart(25);
=======
        cart6 = newCart(25);
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
        
        cart6Expected = 0.0;
        
<<<<<<< HEAD
        cart7 = new Cart(30);
=======
        cart7 = newCart(30);
>>>>>>> Review
        for(int i = 0; i<1; i++) {
        	cart7.addItem(new Alcohol());
        }
        for(int i = 0; i<2; i++) {
        	cart7.addItem(new Meat());
        }
        
        cart7Expected = 0.0;
        
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
<<<<<<< HEAD
    @Test
    public void emptyCart() throws UnderAgeException{
        assertEquals(0.0, cart.Amount_saved(), .01);
    }
    
    @Test
    public void produce_savings()throws UnderAgeException{
        assertEquals(0.0, cart2.Amount_saved(), .01);
        assertEquals(25.0, cart2.calcCost(), .01);

    }
    
    @Test
    public void taxCheck()throws UnderAgeException{
        assertEquals(0.80, cart7.getTax(10, "AZ"), .01);
        assertEquals(0.90, cart7.getTax(10, "CA"), .01);
        assertEquals(0.7, cart7.getTax(10, "NY"), .01);
        assertEquals(0.70, cart7.getTax(10, "CO"), .01);
        assertEquals(10.0, cart7.getTax(10, "AZf"), .01);
        }

    
=======
>>>>>>> Review

    // sample test
    @Test
    public void Amount_savedCart1() throws UnderAgeException {
        double amount = cart1.Amount_saved();
        assertEquals(cart1Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart2() throws UnderAgeException {
        double amount = cart2.Amount_saved();
        assertEquals(cart2Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart3() throws UnderAgeException {
        double amount = cart3.Amount_saved();
        assertEquals(cart3Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart4() throws UnderAgeException {
        double amount = cart4.Amount_saved();
        assertEquals(cart4Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart5() throws UnderAgeException {
        double amount = cart5.Amount_saved();
        assertEquals(cart5Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart6() throws UnderAgeException {
        double amount = cart6.Amount_saved();
        assertEquals(cart6Expected, amount, .01);
    }
    @Test
    public void Amount_savedCart7() throws UnderAgeException {
        double amount = cart7.Amount_saved();
        assertEquals(cart7Expected, amount, .01);
    }
}