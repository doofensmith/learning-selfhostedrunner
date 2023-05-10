package com.learning.jpaspec.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.jpa.JpaComplianceViolation;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public abstract class PendingDao extends BaseDao implements Serializable {

    @Serial
    private static final long serialVersionUID = 5037581505374910773L;

    @Column(name = "ticket_no", nullable = false)
    private Long ticketNo;

    @Column(name = "module_changed", nullable = false)
    private String moduleChanged;

    @Column(name = "module_level", nullable = false)
    private String moduleLevel;

    @Column(name = "is_approved", nullable = false)
    private Boolean isApproved;

    @Column(name = "approved_at")
    private LocalDateTime approvedAt;

    @Column(name = "approved_by")
    private String approvedBy;

    @Override
    void onCreate() {
        super.onCreate();
        this.isApproved = Boolean.FALSE;
    }
}
