package com.example.springVlmProject.controller;

import com.example.springVlmProject.domain.Catalog;
import com.example.springVlmProject.domain.Equipment;
import com.example.springVlmProject.repository.CatalogRepository;
import com.example.springVlmProject.services.CatalogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController extends AbstractController<Catalog>{
    private final CatalogService service;
    public CatalogController(CatalogRepository repo, CatalogService service) {
        super(repo);
        this.service = service;
    }
    @GetMapping("/equipments/catalogId")
    public List<Equipment> getEquipments (@RequestParam Long id){
        return service.getEquipments(id);
    }

    @Override
    public void deleteEntityById(Long id) {
        super.deleteEntityById(id);
        System.out.println("Каталог с id = " + id + " был удален");
    }
}
