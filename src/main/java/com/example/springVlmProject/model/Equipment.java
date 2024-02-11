package com.example.springVlmProject.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Equipment extends AbstractEntity{
    private String name;
    private Integer inventoryNumber;
    private Integer mfrNumber;
    private Certificate certificate;
}
