package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Catalog;
import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.CatalogRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService{
    private final CatalogRepository repository;

    public CatalogService(CatalogRepository repository) {
        this.repository = repository;
    }

    public List<Equipment> getEquipments(Long id){
        Catalog catalog = getCatalog(id);
        return catalog.getEquipmentList();
    }
    private Catalog getCatalog (Long id){
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public Iterable<Equipment> putEquipmentList(Long id, Equipment equipment){ // добавить валидацию
        Catalog catalog = getCatalog(id);
        catalog.getEquipmentList().add(equipment);
        return catalog.getEquipmentList();
    }


}
