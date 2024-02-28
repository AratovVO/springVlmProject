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
    @GetMapping("/equipments")
    public List<Equipment> getEquipments (@RequestParam Long id){
        return service.getEquipments(id);
    }

//    @GetMapping
//    public Equipment getEquipmentByInvNumber (){
//        return null;
//    }
    @PostMapping("/{id}/equipments")
    public List<Equipment> addEquipmentToCatalog(@PathVariable Long id, @RequestBody Equipment equipment){
        return service.addEquipmentToCatalog(id, equipment);
    }

    @Override
    public void deleteEntityById(Long id) {
        super.deleteEntityById(id);
    }

}
