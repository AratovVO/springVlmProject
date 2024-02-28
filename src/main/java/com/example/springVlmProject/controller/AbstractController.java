package com.example.springVlmProject.controller;

import com.example.springVlmProject.repository.Repository;
import com.example.springVlmProject.utils.Utils;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;


//@NoArgsConstructor(force = true)
public class AbstractController<E> {
    protected final Repository<E, Long> repository;

    public AbstractController(Repository<E, Long> repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<E> getEntities() {
        return repository.findAll();
    }

    @PostMapping()
    public E createEntity(@RequestBody E entity) {
        return repository.save(entity);
    }

    @PatchMapping("{entityId}")
    public E updateEntity(@PathVariable Long entityId, @RequestBody E entityBody) {
        E updatableEntity = findEntityById(entityId);
        Utils.copy(entityBody, updatableEntity); // возвращает объект с обновленными полями
        return repository.save(updatableEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntityById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        repository.deleteAll();
    }

    @GetMapping("{id}")
    public E findEntityById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
