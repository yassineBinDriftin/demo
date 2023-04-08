package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    private  Integer id;
    private  String nom;
    private  Integer dureeContratMoins;
    private  Integer salaireAnnuel;
    private Boolean active;
    private String pays;
    private String nomSociete;
}
