package com.example.demo.controller;

import com.example.demo.entity.Contrat;
import com.example.demo.service.ContratServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/apispring")
@RestController
public class ContratController {
    @Autowired
    ContratServiceImpl contratService;

    @GetMapping("/getContrat/{id}")
    public Contrat getCandiat(@PathVariable("id") Integer id){
        return contratService.getContrat(id);
    }

    @GetMapping("/getAllContrat")
    public List<Contrat> getAllCandidat(){
        return contratService.getAllContrat();
    }

    @PostMapping("/addContrat")
    public Contrat addCandidat(@RequestBody Contrat contrat){
        return contratService.addContrat(contrat);

    }
    @PostMapping("/deleteContrat/{id}")
    public  Boolean deleteCandidat(@PathVariable("id") Integer id) {
        if (id != null) {
            contratService.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
