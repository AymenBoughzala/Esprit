package gestionemployes.entities;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
	private int id ,nombre ;
	private String nom;
	
	public Departement () {
		
	}
	public Departement(int id ,int nombre ,String nom) {
		this.id = id;
		this.nombre = nombre;
		this.nom = nom;
	}
	
	public int getId () {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departement other = (Departement) obj;
		return id == other.id && Objects.equals(nom, other.nom);
	}
	@Override
	public String toString() {
		return "Département [id=" + id + ", nombre=" + nombre + ", nom=" + nom + "]";
	}
	@Override
    public int compareTo(Departement autreDepartement) {
        int comparaisonParId = Integer.compare(this.id, autreDepartement.id);
        if (comparaisonParId == 0) {
            return this.nom.compareTo(autreDepartement.nom);
        }
        return comparaisonParId;
    }

	

	
}
