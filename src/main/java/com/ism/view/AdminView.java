package com.ism.view;

import java.util.List;
import java.util.Scanner;

import com.ism.domain.Etudiant;
import com.ism.dto.EtudiantDto;

public class AdminView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String saisieChaine(String sms) {
        String chaine;
        do {
            System.out.print(sms);
            chaine = scanner.nextLine().trim();
        } while (chaine.isEmpty());
        return chaine;
    }   

    public static void menu() {
        System.out.println("1-Cree un Etudiant.");
        System.out.println("2-liste les etudiant");       
    }

    public static void showAllEtudiants(List<Etudiant> etudiants){
        for (Etudiant etudiant : etudiants) {
            etudiant.toString();
        }
    }

    public static EtudiantDto saisieEtudiant(){
        String nc=saisieChaine("Nom complet: ");
        String mat=saisieChaine("Matricule: ");
        return new EtudiantDto(nc,mat);
    }
}
