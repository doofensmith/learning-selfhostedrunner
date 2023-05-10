package com.learning.jpaspec.domain.dao;

import com.learning.jpaspec.domain.common.PendingDao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLDelete;

import java.io.Serial;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "t_person_pending")
@SQLDelete(sql = "update t_person_pending set approved_at=current_timestamp, is_approved=true where id=?")
public class PersonPendingDao extends PendingDao {

    @Serial
    private static final long serialVersionUID = -2071084423859902142L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

}
