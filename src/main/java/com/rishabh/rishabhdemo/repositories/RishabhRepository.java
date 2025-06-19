package com.rishabh.rishabhdemo.repositories;

import com.rishabh.rishabhdemo.entities.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RishabhRepository extends JpaRepository<MyEntity, UUID> {
}
