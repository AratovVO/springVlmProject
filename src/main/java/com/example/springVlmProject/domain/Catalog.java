package com.example.springVlmProject.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
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

    @Column(name = "equipment_list")
    @OneToMany(mappedBy = "catalogId")
    @JsonIgnore
    private List<Equipment> equipmentList;

}
