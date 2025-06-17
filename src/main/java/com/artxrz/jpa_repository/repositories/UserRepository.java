package com.artxrz.jpa_repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artxrz.jpa_repository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
