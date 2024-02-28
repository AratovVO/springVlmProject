package com.example.springVlmProject.controller;

import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.Repository;
import com.example.springVlmProject.services.EquipmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipments")
public class EquipmentController extends AbstractController<Equipment> {
    EquipmentService equipmentService;

    public EquipmentController(Repository<Equipment, Long> repository, EquipmentService equipmentService) {
        super(repository);
        this.equipmentService = equipmentService;
    }


//    @Override
//    public Equipment createEntity(Equipment entity) {
//        entity.setCatalogId(null);
//        return equipmentService.addEquipment(entity);
//    }
}
