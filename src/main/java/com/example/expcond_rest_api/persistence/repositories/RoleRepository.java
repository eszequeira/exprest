package com.example.expcond_rest_api.persistence.repositories;

import com.example.expcond_rest_api.persistence.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
