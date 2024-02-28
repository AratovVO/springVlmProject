package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Certificate;
import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

@Service

public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }
    public Equipment addEquipment(Equipment equipment){
        Certificate certificate = new Certificate();
        return repository.save(equipment);
    }


}
