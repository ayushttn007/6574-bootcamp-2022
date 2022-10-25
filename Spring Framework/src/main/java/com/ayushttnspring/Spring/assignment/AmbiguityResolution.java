package com.ayushttnspring.Spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
interface Rooms
{
    public void info();
}

@Component
class Hotels
{

    @Autowired
    Rooms rooms;

    public void bookRoom(Rooms rooms)
    {
        this.rooms = rooms;
    }

    public void getRoom() {
        System.out.println("Room is booked");
        rooms.info();
    }

}
@Component

class Taj implements Rooms{
    @Override
    public void info(){
        System.out.println("Welcome to Taj");
    }
}




@Component
@Primary
class Oberoi implements Rooms{
    @Override
    public void info(){
        System.out.println("Welcome to Oberoi Hotel");
    }
}

@SpringBootApplication
public class AmbiguityResolution {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AmbiguityResolution.class,args);
        Hotels hotels = applicationContext.getBean(Hotels.class);
        hotels.getRoom();
    }
}