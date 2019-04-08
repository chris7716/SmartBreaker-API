package com.bloom.smartbreaker.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloom.smartbreaker.models.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

}
