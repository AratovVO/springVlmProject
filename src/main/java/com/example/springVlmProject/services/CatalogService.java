package com.example.springVlmProject.services;

import com.example.springVlmProject.model.Catalog;
import com.example.springVlmProject.model.Equipment;
import com.example.springVlmProject.repository.CatalogRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class CatalogService {
    CatalogRepo repository;

    public CatalogService(CatalogRepo repository) {
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
