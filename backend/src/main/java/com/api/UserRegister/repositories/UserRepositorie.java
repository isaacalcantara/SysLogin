package com.api.UserRegister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositorie extends JpaRepository<User, UUID> {

}
