package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Catalog;
import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.CatalogRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CatalogService {
    private final CatalogRepository repository;

    public CatalogService(CatalogRepository repository) {
        this.repository = repository;
    }

    public List<Equipment> getEquipments(Long id) {
        Catalog catalog = getCatalog(id);
        return catalog.getEquipmentList();
    }

    private Catalog getCatalog(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    //   public Equipment addEquipment(Equipment equipment, Long id){
//        Catalog catalog = getCatalog(id);
//
//   }
    public List<Equipment> addEquipmentToCatalog(Long id, Equipment equipment){
        Catalog catalog = getCatalog(id);
        catalog.getEquipmentList().add(equipment);
        return catalog.getEquipmentList();
    }


}
