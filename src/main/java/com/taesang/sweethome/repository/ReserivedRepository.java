package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.Reserived;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReserivedRepository extends JpaRepository<Reserived, Long> {
}