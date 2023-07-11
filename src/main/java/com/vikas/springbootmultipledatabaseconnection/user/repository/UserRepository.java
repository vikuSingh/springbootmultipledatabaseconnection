package com.vikas.springbootmultipledatabaseconnection.user.repository;

import com.vikas.springbootmultipledatabaseconnection.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
