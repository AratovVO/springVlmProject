package com.example.springVlmProject.repository;

import com.example.springVlmProject.domain.Equipment;

public interface EquipmentRepository extends Repository<Equipment, Long>{
    @Override
    default Class<Equipment> getClazz(){
        return Equipment.class;
    }
}
