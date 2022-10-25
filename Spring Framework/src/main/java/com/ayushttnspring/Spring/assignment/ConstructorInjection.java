package com.ayushttnspring.Spring.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
interface HotelsNavigator{
    void display();
}

@Component
class DisplayClass implements HotelsNavigator{
    @Override
    public void display(){
        System.out.println("display Method.");
    }
}
@Component
class HotelsChains {




    private HotelsNavigator hotelNav;

    @Autowired
    public  void HotelChains( HotelsNavigator hotelNav) {
        this.hotelNav = hotelNav;
        System.out.println("contructor called.");
    }


}

@SpringBootApplication
public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConstructorInjection.class, args);
        HotelsChains hotel = context.getBean(HotelsChains.class);
    }

}
