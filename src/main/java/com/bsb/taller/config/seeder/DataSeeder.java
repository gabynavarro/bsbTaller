package com.bsb.taller.config.seeder;

import com.bsb.taller.models.entity.Client;
import com.bsb.taller.models.entity.Employee;
import com.bsb.taller.repository.ClientRepository;
import com.bsb.taller.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DataSeeder {
    private static final int MIN_YEAR = 1980;
    private static final int MAX_YEAR = 2023;
    private static final String[] COLORS = {"Rojo", "Azul", "Verde", "Negro", "Blanco"};
    private static final String[] MARCAS = {"Ford", "Toyota", "Chevrolet", "Honda", "Nissan"};
    private static final String[] MODELOS = {"Sedán", "Pickup", "Camioneta", "SUV", "Deportivo"};
    private static final String[] PATENTES = {"ABC123", "DEF456", "GHI789", "JKL012", "MNO345"};

    private final EmployeeRepository employeeRepository;
    private final ClientRepository clientRepository;
    private final int numPeople = 10;
    private final Faker faker = new Faker();
    @EventListener
    public void seed(ContextRefreshedEvent event) throws Exception {
        // create role
        List<Employee> employees = employeeRepository.findAll();
        if (employees.isEmpty()) {
            createEmploye();
        }
        if(clientRepository.findAll().isEmpty()){
            createClient();
        }
}

    private void createClient() {
        for (int i = 0; i < numPeople; i++){
            Client c=Client.builder()
                   .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .address(faker.address().streetAddress())
                    .zipCode(faker.address().zipCode())
                    .phone(faker.phoneNumber().cellPhone())
                    .department(faker.job().field())
                    .location(faker.address().city())
                    .number(String.valueOf(faker.number().numberBetween(1, 100)))
                    .floor(String.valueOf(faker.number().numberBetween(1, 10)))
                    .type("Client")
                    .email(faker.internet().emailAddress())
                    .linePhone(faker.phoneNumber().cellPhone())
                    .build();
            clientRepository.save(c);
        }

    }

    private void createEmploye() {
        for (int i = 0; i < numPeople; i++) {
                Employee e=Employee.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .address(faker.address().streetAddress())
                        .zipCode(faker.address().zipCode())
                        .phone(faker.phoneNumber().cellPhone())
                        .department(faker.job().field())
                        .location(faker.address().city())
                        .number(String.valueOf(faker.number().numberBetween(1, 100)))
                        .floor(String.valueOf(faker.number().numberBetween(1, 10)))
                        .type("Employe")
                        .sector(faker.job().field())
                        .build();
            employeeRepository.save(e);
        }
      }
    }
