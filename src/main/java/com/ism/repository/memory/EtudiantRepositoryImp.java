package com.ism.repository.memory;

import java.util.List;

import com.ism.domain.Etudiant;
import com.ism.repository.EtudiantRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class EtudiantRepositoryImp implements EtudiantRepository {
    private DataBaseMemory db;

    
    @Override
    public boolean save(Etudiant etudiant) {
        return db.etudiants.add(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return db.etudiants;
    }
    
}
