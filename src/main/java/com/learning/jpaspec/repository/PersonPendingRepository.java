package com.learning.jpaspec.repository;

import com.learning.jpaspec.domain.dao.PersonPendingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonPendingRepository extends JpaRepository<PersonPendingDao, UUID> {
}
