package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.SubHomes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SubHomesRepository extends JpaRepository<SubHomes, Long> {
}