package com.gihub.grigoriykarpuhin.vkproject.repositories;

import com.gihub.grigoriykarpuhin.vkproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
