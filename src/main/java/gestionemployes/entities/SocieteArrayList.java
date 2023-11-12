package gestionemployes.entities;
import gestionemployes.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SocieteArrayList<T extends Employe> implements IGestion<T> {

    private ArrayList<T> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(T employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (T employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(T employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(T employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (T employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<T>() {
            @Override
            public int compare(T emp1, T emp2) {
                int result = emp1.getNom().compareTo(emp2.getNom());
                if (result == 0) {
                    result = emp1.getNom_departement().compareTo(emp2.getNom_departement());
                }
                if (result == 0) {
                    result = Integer.compare(emp1.getGrade(), emp2.getGrade());
                }

                return result;
            }
        });
    }
}
