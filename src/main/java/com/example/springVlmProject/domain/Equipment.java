package com.example.springVlmProject.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Equipment extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "inventory_number")
    private Integer inventoryNumber;

    @Column(name = "mfr_number")
    private Integer mfrNumber;


//    @Column(name = "certificate")
    @OneToOne
    @JoinColumn(name = "certificate_id", referencedColumnName = "id")
    private Certificate certificate;

    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalogId;
}
