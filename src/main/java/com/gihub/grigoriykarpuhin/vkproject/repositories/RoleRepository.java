package com.gihub.grigoriykarpuhin.vkproject.repositories;

import com.gihub.grigoriykarpuhin.vkproject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String role);
}
