package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}