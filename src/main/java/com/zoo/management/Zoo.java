package com.zoo.management;

public class Zoo {
	Animal[] animals;
	String name;
	String city;
	int nbrCages;
	int animalCount;
	
	public Zoo( String name, String city, int nbrCages) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
		this.nbrCages = nbrCages;
	}

	void displayZoo() {
		System.out.println ("nom : " + name);
		System.out.println ("city : " + city);
		System.out.println ("nbrCages : " + nbrCages);
	}
	 public String toString() {
	        return "Zoo {" +"name='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrCages + '}';
	    }
//Instruction 10 : Add animal 
	 public boolean addAnimal(Animal animal) {
		 if (animalCount < nbrCages) {
			 animals [animalCount] = animal;
			 animalCount++;
			 return true; 
		 } else {
	            System.out.println("impossible d'ajouter un nouvel animal.");
	            return false;
	        }
	 }
	 
	 public void displayAnimals() {
	        if (animalCount == 0) {
	            System.out.println("Aucun animal dans le zoo.");
	        } else {
	            System.out.println("Animaux dans le zoo :");
	            for (int i = 0; i < animalCount; i++) {
	                System.out.println((i + 1) + ". " + animals[i].name);
	            }
	        }
	 }
	 public int searchAnimal(String name) {
	        for (int i = 0; i < animalCount; i++) {
	            if (animals[i].name.equals(name)) {
	                return i;  
	            }
	        }
	        return -1;  
	    }

}
