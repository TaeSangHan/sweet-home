package com.taesang.sweethome.repository;

import com.taesang.sweethome.domain.SubHomesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SubHomesTypeRepository extends JpaRepository<SubHomesType, Integer> {
}