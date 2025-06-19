package com.rishabh.rishabhdemo.controllers;

import com.rishabh.rishabhdemo.entities.MyEntity;
import com.rishabh.rishabhdemo.service.RishabhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rishabh")
public class RishabhController {

    @Autowired
    private RishabhService service;

    @GetMapping("/all")
    public List<MyEntity> getAll() {
        return service.getAll();
    }

    @PostMapping
    public MyEntity create(@RequestBody MyEntity myEntity) {
        return service.create(myEntity);
    }

    @PutMapping("/{id}")
    public MyEntity update(@PathVariable UUID id, @RequestBody MyEntity myEntity) {
        return service.update(id, myEntity);
    }
}

