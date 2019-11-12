package com.baktas.springmvcpostexample.repository;

import com.baktas.springmvcpostexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

}