package com.excellence.springbootlogginglogback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springbootlogginglogback.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
