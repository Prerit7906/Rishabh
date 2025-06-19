package com.rishabh.rishabhdemo.service;

import com.rishabh.rishabhdemo.entities.MyEntity;
import com.rishabh.rishabhdemo.repositories.RishabhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RishabhService {

    @Autowired
    private RishabhRepository rishabhRepository;

    public List<MyEntity> getAll() {
        return rishabhRepository.findAll();
    }

    public MyEntity create(MyEntity myEntity) {
        return rishabhRepository.save(myEntity);
    }

    public MyEntity update(UUID id, MyEntity myEntity) {
        myEntity.setId( id );
        return rishabhRepository.save(myEntity);
    }
}
