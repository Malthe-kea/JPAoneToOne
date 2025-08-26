package com.example.jpaonetoone.repositories;

import com.example.jpaonetoone.model.Employee;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.InvalidDataAccessApiUsageException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    void testAtLeastOneJens() {
        List<Employee> lst = employeeRepository.findEmployeeByName("Jens");
        assertTrue(lst.size()>0);
    }

    @Test
    void testDeleteUser() {
        List<Employee > lst = employeeRepository.findEmployeeByName("Jens");
        Employee emp1 = lst.get(0);
        assertEquals("Jens", emp1.getName());
        assertThrows(InvalidDataAccessApiUsageException.class, () -> userRepository.delete(emp1.getUser()));

    }
}