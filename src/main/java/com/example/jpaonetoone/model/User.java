package com.example.jpaonetoone.model;

import jakarta.persistence.*;

@Entity
public class User {

    @OneToOne(mappedBy = "user")
    private Employee employee;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(unique = true)
    private String email;
    private String password;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
