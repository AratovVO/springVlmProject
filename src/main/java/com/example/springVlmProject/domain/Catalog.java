package com.example.springVlmProject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Catalog extends AbstractEntity{

    @Column(name = "title")
    private String title;
    @Transient
    @Column(name = "equipment_list")
    private List<Equipment> equipmentList;
}
