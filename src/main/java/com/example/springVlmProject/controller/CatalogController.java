package com.example.springVlmProject.controller;

import com.example.springVlmProject.model.Catalog;
import com.example.springVlmProject.model.Equipment;
import com.example.springVlmProject.repository.CatalogRepo;
import com.example.springVlmProject.repository.Repository;
import com.example.springVlmProject.services.CatalogService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController extends AbstractController<Catalog> {
    private CatalogService service;
    private CatalogRepo repo;

    public CatalogController(CatalogRepo repo, CatalogService service) {
        super(repo);
        this.repo = repo;
        this.service = service;
    }
    @GetMapping("/equipments/catalogId")
    public List<Equipment> getEquipments (@RequestParam Long id){
        return service.getEquipments(id);
    }
}
