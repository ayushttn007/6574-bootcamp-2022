package com.ayushttnspring.Spring.assignment;

interface Bakery{
    public void sell ();
}

class Cake implements Bakery{
    @Override
    public void sell(){
        System.out.println("Cake  sold");
    }
}

class Pastry implements Bakery{
    @Override
    public void sell(){
        System.out.println("Pastry Sold");
    }
}

class Customer {


    private Bakery  backery;

    public Bakery getBakery() {
        return backery;
    }
    public void setBakery(Bakery backery) {
        this.backery = backery;
    }

    public void sellStart () {
        backery.sell();
    }
}

public class LosslyCoupled {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setBakery(new Cake());
        customer.sellStart();
        customer.setBakery(new Pastry());
        customer.sellStart();
    }
}
