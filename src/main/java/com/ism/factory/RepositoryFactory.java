package com.ism.factory;

import com.ism.repository.EtudiantRepository;
import com.ism.repository.memory.DataBaseMemory;
import com.ism.repository.memory.EtudiantRepositoryImp;

public class RepositoryFactory {
    public static EtudiantRepository createEtudiantReposittory(){
        return new EtudiantRepositoryImp(DataBaseMemory.getInstance());
    }
}
 