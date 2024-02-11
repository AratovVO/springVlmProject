package com.example.springVlmProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface Repository<T, ID> extends CrudRepository<T, Long> {
    Class<T> getClazz();
}
