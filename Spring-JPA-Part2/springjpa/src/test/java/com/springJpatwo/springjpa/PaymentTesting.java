package com.springJpatwo.springjpa;

import com.springJpatwo.springjpa.entities.Check;
import com.springJpatwo.springjpa.entities.CreditCard;
import org.junit.jupiter.api.Test;
import com.springJpatwo.springjpa.repos.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentTesting {
    @Autowired
    PaymentRepository repository;
    @Test
    public void createPayment()
    {
        CreditCard creditCard=new CreditCard();
        creditCard.setId(55);
        creditCard.setAmount(12000);
        creditCard.setCardnumber("4kcfg83");
        repository.save(creditCard);
    }
    @Test
    public void createCheckPayment()
    {
        Check check=new Check();
        check.setId(250);
        check.setAmount(52500);
        check.setCheckNumber("gh1f5");
        repository.save(check);
    }
}