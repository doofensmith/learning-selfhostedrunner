package com.learning.jpaspec.domain.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "t_approval")
public class ApprovalDao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

}
