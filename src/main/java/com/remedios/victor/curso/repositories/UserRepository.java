package com.remedios.victor.curso.repositories;

import com.remedios.victor.curso.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String login);
}
