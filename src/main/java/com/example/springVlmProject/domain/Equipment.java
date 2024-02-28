package com.example.springVlmProject.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Equipment extends AbstractEntity {

    private String name;


    private Integer inventoryNumber;


    private Integer mfrNumber;



    @OneToOne(cascade = CascadeType.PERSIST)
    private Certificate certificate;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "catalog_id")
    private Catalog catalogId;

}
