package com.example.springVlmProject.services;

import com.example.springVlmProject.repository.Repository;

public class AbstractService<T> {
    Repository<T, Long> repository;

    public AbstractService(Repository<T, Long> repository) {
        this.repository = repository;
    }
}
