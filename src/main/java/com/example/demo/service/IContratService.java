package com.example.demo.service;

import com.example.demo.entity.Contrat;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IContratService {
    public Contrat addContrat(Contrat contrat);
    public List<Contrat> getAllContrat();
    public Contrat getContrat(Integer id);
    public Boolean deleteById(Integer id);
}
