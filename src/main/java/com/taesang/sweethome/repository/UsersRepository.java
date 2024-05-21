package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface UsersRepository extends JpaRepository<Users, String> {
}