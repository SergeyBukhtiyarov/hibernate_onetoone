package com.example.hibernateonetoone;

import com.example.hibernateonetoone.entity.Details;
import com.example.hibernateonetoone.repository.DetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddDetailsToDB {

    @Autowired
    DetailsRepository repository;

    @Test
    public void addDetaisToDB() {

        Details details1 = new Details();
        details1.setCity("Samara");
        details1.setEmail("buhtiyarov@mail.com");
        details1.setPhone_number("1234567");

        Details details2 = new Details();
        details2.setCity("Moscow");
        details2.setEmail("buhtiyarov@mail.com");
        details2.setPhone_number("7654321");

        Details details3 = new Details();
        details3.setCity("Norilsk");
        details3.setEmail("buhtiyarov@mail.com");
        details3.setPhone_number("5678901");

        repository.save(details1);
        repository.save(details2);
        repository.save(details3);



    }
}
