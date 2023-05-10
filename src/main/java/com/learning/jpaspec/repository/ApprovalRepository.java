package com.learning.jpaspec.repository;

import com.learning.jpaspec.domain.dao.ApprovalDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ApprovalRepository extends JpaRepository<ApprovalDao, UUID> {
}
