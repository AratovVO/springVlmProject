package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }
    public Equipment addEquipment(Equipment equipment){
        return repository.save(equipment);
    }

}
