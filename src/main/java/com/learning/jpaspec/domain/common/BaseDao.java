package com.learning.jpaspec.domain.common;

import com.learning.jpaspec.constant.AppConstant;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public abstract class BaseDao implements Serializable {

    @Serial
    private static final long serialVersionUID = 9182268181235434010L;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @PrePersist
    void onCreate() {
        this.createdAt = LocalDateTime.now(ZoneId.of(AppConstant.APP_TIMEZONE));
        this.createdBy = "SYSTEM";
    }

    @PreUpdate
    void onUpdate() {
        this.updatedAt = LocalDateTime.now(ZoneId.of(AppConstant.APP_TIMEZONE));
        this.updatedBy = "SYSTEM";
    }

}
