package com.jala.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jala.model.UserCredential;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
