package com.ayushttnspring.Spring.assignment;

class CakeT  {
    public void sell() {
        System.out.println("Cake sold");
    }
}

class CustomerT {
    Cake cake = new Cake();
    public void SellStart() {
        cake.sell();
    }

}
public class TightCoupling {

    public static void main(String[] args) {
        CustomerT customer = new CustomerT();
        customer.SellStart();
    }
}
