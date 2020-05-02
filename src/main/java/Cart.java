package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    protected int userAge;
    public List<Product> cart;
    // public int cartStorage; SER316 TASK 2 SPOTBUGS

    /**
     * Calculates the final cost after all savings and tax has been applied. Also checks
     * that the user is of age to purchase alcohol 
     * if it is in their cart at checkout. 
     * Sales tax is always AZ tax.
     * Calculation is based off of the following prices and deals:
     * Dairy -> $3
     * Meat -> $10
     * Produce -> $2 or 3 for $5
     * Alcohol -> $8
     * Frozen Food -> $5
     * Alcohol + Frozen Food -> $10
     * If there is an alcohol product in the cart and the user is under 21, then an
     * UnderAgeException should be thrown.
     *
     * @return double totalCost
     *
     */
    public double calcCost() throws UnderAgeException {
        
        double cost = 0;
        
        for(Product product : cart) {
            cost += product.getCost();
            
            if(product instanceof Alcohol && this.userAge < 21) {
                throw new UnderAgeException("Cart Owner must be 21 or over to purchase alcohol");
            }
        }
        
        cost += this.amount_saved();
        return cost + this.getTax(cost,  "AZ");
    }

     
     
     
    /**
     * calculates how much was saved in the current shopping cart. 
     * based on the deals, returns the saved amount
     * throws exception if alcohol is bought from underage person
     * TODO: Create node graph for this method in assign 4: 
     * create white box tests and fix the method, reach at least 98% coverage 
     * @return
     * UnderAgeException
     */
    public int amount_saved() throws UnderAgeException {
        int discount = 0;
        double produce_counter = 0;
        int alcoholCounter = 0;
        int frozenFoodCounter = 0;
        
        for(int i = 0; i < cart.size(); i++) {
            if(cart.get(i) instanceof Produce) {
                produce_counter++;
            }else if(cart.get(i) instanceof Alcohol) {
                alcoholCounter++;
            }else if (cart.get(i) instanceof FrozenFood) {
                frozenFoodCounter++;
            }
        }
        discount += (int) Math.floor(produce_counter / 3);
        discount += Math.min(alcoholCounter, frozenFoodCounter);
        
        return discount;
    }

    /**
     * Gets the tax based on state and the total.
     * @return
     */
    public double getTax(double totalbT, String twoLetterUSstateAbbreviation) {
        Map<String, Double> taxeCodes = new HashMap<String, Double>();
        taxeCodes.put("AZ", 0.08);
        taxeCodes.put("CA", 0.09);
        taxeCodes.put("NY", 0.1);
        taxeCodes.put("CO", 0.07);
        return taxeCodes.getOrDefault(twoLetterUSstateAbbreviation, 0.0);
    }

    public void addItem(Product np) {
        cart.add(np);
    }

    /**
     * remove item.
     * @return
     */
    public boolean removeItem(Product productToRemove) { //SER316 TASK 2 SPOTBUGS
        boolean test = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) == productToRemove) {
                cart.remove(i);
                test = true;
                return test;
            }
        }
        return false;
    }

    public Cart(int age) {
        userAge = age;
        cart = new ArrayList<Product>();
    }
    
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    
    public List<Product> getCart(){
        return cart;
    }
}
