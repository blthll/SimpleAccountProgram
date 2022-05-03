package com.sonhal.simpleaccountantprogram.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * BaseEntity
 *
 * @author s84240320
 * @since 2022-05-03
 */
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime creationDate;
    @UpdateTimestamp
    private LocalDateTime lastUpdateDate;
}
