package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Catalog;
import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.CatalogRepository;
import com.example.springVlmProject.repository.EquipmentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    private final CatalogRepository repository;
    private final EquipmentRepository equipmentRepository;

    public CatalogService(CatalogRepository repository, EquipmentRepository equipmentRepository) {
        this.repository = repository;
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> getEquipments(Long id) {
        Catalog catalog = getCatalog(id);
        return catalog.getEquipments();
    }

    private Catalog getCatalog(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    //   public Equipment addEquipment(Equipment equipment, Long id){
//        Catalog catalog = getCatalog(id);
//
//   }
    public List<Equipment> addEquipmentToCatalog(Long id, Equipment equipment) {
        Catalog catalog = getCatalog(id);
        catalog.getEquipments().add(equipment);
        return catalog.getEquipments();
    }



}
