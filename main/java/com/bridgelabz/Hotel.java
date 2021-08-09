package com.bridgelabz;

public class Hotel {
    public String name;
    public int regularCustomerRate;
    /*
     * Created a parameterize constructor of the class hotel .
     */
    public Hotel(String name, int regularCustomerRate)
    {
        this.name = name;
        this.regularCustomerRate = regularCustomerRate;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", regularCustomerRate=" + regularCustomerRate +
                '}';
    }
}
