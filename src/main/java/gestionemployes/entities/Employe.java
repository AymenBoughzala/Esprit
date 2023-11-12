package gestionemployes.entities;

import java.util.Objects;

public class Employe implements Comparable<Employe> {

	private int id;
	private String nom;
	private String prenom;
	private String nom_departement;
	private int grade;

	public Employe () {
		
	}

	public Employe(int id, String nom, String prenom, String nom_departement, int grade) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nom_departement = nom_departement;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom_departement() {
		return nom_departement;
	}

	public void setNom_departement(String nom_departement) {
		this.nom_departement = nom_departement;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return id == other.id && Objects.equals(nom, other.nom);
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nom_departement=" + nom_departement
				+ ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Employe o) {
		 return Integer.compare(this.getId(), o.getId());
	}
	
	
	

}
