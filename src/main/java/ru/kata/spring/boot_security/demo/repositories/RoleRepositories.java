package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;


@Repository
public interface RoleRepositories extends JpaRepository<Role,Long> {
    Role getRoleByName(String name);

    Role findByName(String name);

}