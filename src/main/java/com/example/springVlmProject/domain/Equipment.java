package com.example.springVlmProject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Equipment extends AbstractEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "inventory_number")
    private Integer inventoryNumber;
    @Column(name = "mfr_number")
    private Integer mfrNumber;
    @Transient
    @Column(name = "certificate")
    private Certificate certificate;
}
