package com.ism;

import com.ism.factory.RepositoryFactory;
import com.ism.repository.EtudiantRepository;
import com.ism.service.EtudiantServiceImp;
import com.ism.view.AdminView;

public class Main {
    public static void main(String[] args) {
        EtudiantRepository etuRipo = RepositoryFactory.createEtudiantReposittory();
        EtudiantServiceImp etuService = new EtudiantServiceImp(etuRipo);
        String choice;
        do {
            choice = AdminView.menu();
            switch (choice) {
                case "1":
                    var etu = AdminView.saisieEtudiant();
                    etuService.addEtudiant(etu);
                    System.out.println(etu.toString());
                    break;
                case "2":
                    var etus = etuService.findAll();
                    AdminView.showAllEtudiants(etus);
                    break;
                case "3":
                    System.out.println("Au revoir.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (!choice.equals("3"));
    }
}