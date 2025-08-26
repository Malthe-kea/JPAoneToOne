package com.example.jpaonetoone.config;

import com.example.jpaonetoone.model.Employee;
import com.example.jpaonetoone.model.Gender;
import com.example.jpaonetoone.model.User;
import com.example.jpaonetoone.repositories.EmployeeRepository;
import com.example.jpaonetoone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {

        User us1 = new User();
        us1.setEmail("user1@example.com");
        us1.setPassword("12312312gzsdrg");
        userRepository.save(us1);

        us1.setUserId(0);
        us1.setEmail("user132@example.com");
        us1.setPassword("123123123123");
        userRepository.save(us1);

        us1.setUserId(0);
        us1.setEmail("user123121@example.com");
        us1.setPassword("123123123");
        userRepository.save(us1);

        Employee emp1 = new Employee();
        emp1.setBorn(java.time.LocalDateTime.of(1990, 1, 1, 0, 0));
        emp1.setName("Jens");
        emp1.setGender(Gender.MALE);
        emp1.setVegetarian(true);
        emp1.setUser(us1);
        employeeRepository.save(emp1);
    }
}
