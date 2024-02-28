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

    private String title;


    @OneToMany(mappedBy = "catalogId", cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Equipment> equipments;

}
