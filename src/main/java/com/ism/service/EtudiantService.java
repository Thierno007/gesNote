package com.ism.service;

import java.util.List;

import com.ism.domain.Etudiant;
import com.ism.dto.EtudiantDto;

public interface EtudiantService {
    boolean addEtudiant(EtudiantDto etu);
    List<Etudiant> findAll();

}
