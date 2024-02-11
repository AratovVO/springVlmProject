package com.example.springVlmProject.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Certificate extends AbstractEntity{
    private String number; // надо будет валидировать
    private LocalDateTime certStartDate;
    private LocalDateTime certEndDate;
}
