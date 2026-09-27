package com.ism.repository.memory;

import java.util.ArrayList;
import java.util.List;

import com.ism.domain.Etudiant;

public final class DataBaseMemory {
    public List<Etudiant> etudiants = new ArrayList<>();

    private static DataBaseMemory instance;

    public static DataBaseMemory getInstance() {
        if (instance==null) {
            instance = new DataBaseMemory();
        }
        return instance;
    }
    
}
