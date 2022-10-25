package com.demo.ttn.service;

import static org.junit.Assert.*;

import com.demo.ttn.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {


    @Test
    public void testSendEmail_ExceptionThrown() {

        EmailService dummyService = mock(EmailService.class);
        Order order2 = new Order(1,"Harry Potter",150);



        doThrow(new RuntimeException("An Exception Occurred")).when(dummyService).sendEmail(order2);


        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            dummyService.sendEmail(order2);
        });


        // Assert
        String expectedMessage = "An Exception Occurred";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void testSendEmail(){

        EmailService dummyService = mock(EmailService.class);
        Order order1 = new Order(1,"Harry Potter",150);

        when(dummyService.sendEmail(order1,"hogwarts@gmail.com")).thenReturn(true);

        assertTrue(dummyService.sendEmail(order1,"hogwarts@gmail.com"));

    }



}
