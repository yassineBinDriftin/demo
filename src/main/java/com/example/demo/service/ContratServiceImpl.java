package com.example.demo.service;

import com.example.demo.entity.Contrat;
import com.example.demo.repository.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContratServiceImpl implements IContratService{
    @Autowired
    ContratRepository contratRepository;
    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return (List<Contrat>) contratRepository.findAll();
    }

    @Override
    public Contrat getContrat(Integer id) {
        return contratRepository.findById(id).get();
    }

    @Override
    public Boolean deleteById(Integer id) {
        if (id!=null)
        {
            contratRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }
}
