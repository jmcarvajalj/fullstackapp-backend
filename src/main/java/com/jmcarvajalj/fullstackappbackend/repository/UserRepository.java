package com.jmcarvajalj.fullstackappbackend.repository;

import com.jmcarvajalj.fullstackappbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
