package com.example.springVlmProject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Certificate extends AbstractEntity{

    private String number; // надо будет валидировать

    @Column(name = "certification_start_date")
    private LocalDateTime certStartDate;

    @Column(name = "certification_end_date")
    private LocalDateTime certEndDate;


    private Long equipmentId;


}
