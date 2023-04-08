package com.example.demo.repository;

import com.example.demo.entity.Contrat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends MongoRepository<Contrat,Integer> {
}
