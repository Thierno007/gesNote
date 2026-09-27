package com.ism.service;

import java.util.List;

import com.ism.domain.Etudiant;
import com.ism.dto.EtudiantDto;
import com.ism.repository.EtudiantRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class EtudiantServiceImp implements EtudiantService {
    private EtudiantRepository repo;

    @Override
    public boolean addEtudiant(EtudiantDto etu) {
        Etudiant newEtu = Etudiant.builder()
                                    .nomComplet(etu.nomComplet())
                                    .matricule(etu.matricule())
                                    .build();
        return repo.save(newEtu);
    }

    @Override
    public List<Etudiant> findAll() {
        return repo.findAll();
    }
    
}
