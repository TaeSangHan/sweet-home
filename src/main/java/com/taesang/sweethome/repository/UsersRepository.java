package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsersRepository extends JpaRepository<Users, String> {
}