package com.example.springVlmProject.repository;

import com.example.springVlmProject.domain.Catalog;


public interface CatalogRepository extends Repository<Catalog, Long> {
    @Override
    default Class<Catalog> getClazz(){ return Catalog.class;}
    Catalog findByTitleContainsIgnoreCase(String title);
}
