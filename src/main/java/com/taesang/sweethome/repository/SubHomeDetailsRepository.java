package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.SubHomeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface SubHomeDetailsRepository extends JpaRepository<SubHomeDetails, Long> {
}