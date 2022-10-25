package com.demo.ttn.service;

import com.demo.ttn.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {


    @Mock
    EmailService emailService;

    @InjectMocks
    OrderService orderService;

    @Test
    public void testPlaceOrder(){

        Order order = new Order(2, "chocolates", 1529);


        orderService.placeOrder(order);



        verify(emailService, atLeastOnce()).sendEmail(order);



        assertEquals(1834.8d, order.getPriceWithTax(),0.1);

        assertTrue(order.isCustomerNotified());

    }

    @Test
    public void testPlaceOrder_returnsTrue(){
        Order order = new Order(4, "chocolates", 1529);

        when(emailService.sendEmail(order,"ayushbakery@dummymail.com")).thenReturn(true);

        assertTrue(orderService.placeOrder(order,"ayushbakery@dummymail.com"));

    }

}
