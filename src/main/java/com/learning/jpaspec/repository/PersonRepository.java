package com.learning.jpaspec.repository;

import com.learning.jpaspec.domain.dao.PersonDao;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonDao, UUID> {

    @Procedure(value = "sp_insert_person")
    void spInsertPerson(String name, String email);

}
