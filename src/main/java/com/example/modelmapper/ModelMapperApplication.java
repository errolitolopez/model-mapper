package com.example.modelmapper;

import com.example.modelmapper.dao.gateway.CompanyGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ModelMapperApplication implements CommandLineRunner {

    private final CompanyGateway companyGateway;

    public static void main(String[] args) {
        SpringApplication.run(ModelMapperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        companyGateway.getAllCompanies()
                .forEach(System.out::println);

    }
}
