package com.bloom.smartbreaker.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloom.smartbreaker.models.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {

}