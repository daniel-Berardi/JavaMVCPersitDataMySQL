package com.tinder.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tinder.entidades.User;

@Repository
public interface UserRepositorio extends JpaRepository<User, String> {

}
