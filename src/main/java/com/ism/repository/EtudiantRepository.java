package com.ism.repository;

import java.util.List;

import com.ism.domain.Etudiant;

public interface EtudiantRepository {
    boolean save(Etudiant etudiant);
    List<Etudiant> findAll();
}
