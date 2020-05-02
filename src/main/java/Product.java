package main.java;

public class Product {
    private int cost;

    public Product(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cost;
        return result;
    }
    
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        
        if(!(obj instanceof Product)) {
            return false;
        }
        
        return this.getCost() == ((Product) obj).getCost();
    }
}
