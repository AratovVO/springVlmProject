package com.example.springVlmProject.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
//@FieldNameConstants
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    LocalDateTime created;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
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
