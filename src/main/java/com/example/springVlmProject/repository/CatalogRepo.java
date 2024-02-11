package com.example.springVlmProject.repository;

import com.example.springVlmProject.model.Catalog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CatalogRepo extends Repository<Catalog, Long> {
    @Override
    default Class<Catalog> getClazz(){ return Catalog.class;}
    Catalog findByTitleContainsIgnoreCase(String title);
}
