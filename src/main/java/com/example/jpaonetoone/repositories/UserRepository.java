package com.example.jpaonetoone.repositories;

import com.example.jpaonetoone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
