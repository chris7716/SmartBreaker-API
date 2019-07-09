package com.bloom.smartbreaker.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloom.smartbreaker.models.RmsValues;

import java.util.Optional;

@Repository
public interface RmsValuesRepository extends JpaRepository<RmsValues, Long> {
    Page<RmsValues> findByModuleId(Long moduleId, Pageable pageable);
    Optional<RmsValues> findByIdAndModuleId(Long id, Long moduleId);
}