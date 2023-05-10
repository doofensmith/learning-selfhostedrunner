package com.learning.jpaspec.repository;

import com.learning.jpaspec.domain.dao.PersonDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonDao, UUID> {
}
