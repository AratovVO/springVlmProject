package com.example.springVlmProject.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
//@FieldNameConstants
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDateTime created;
    LocalDateTime updated;
    @PreUpdate
    public void preUpdate() {
        updated = LocalDateTime.now();
    }
    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }
}
