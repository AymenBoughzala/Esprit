package com.zoo.management;

public class Zoo {
	Animal[] animals;
	String name;
	String city;
	final int nbrCages = 25;
	int animalCount;
	
	public Zoo( String name, String city, int nbrCages) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
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
	 boolean removeAnimal(Animal animal) {
	        int indexAnimal = searchAnimal(animal);
	        if (indexAnimal == -1)
	            return false;
	        for (int i = indexAnimal; i < animalCount; i++) {
	            animals[i] = animals[i + 1];
	            animals[animalCount] = null;
	            this.animalCount--;
	        }
	        return true;
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
	 int searchAnimal(Animal animal) {
	        int index = -1;
	        for (int i = 0; i < animalCount; i++) {
	            if (animal.name == animals[i].name)
	                return i;
	        }
	        return index;
	    }

	 // instruction 15 
	    public boolean isZooFull () {
	  	  if (nbrCages == animalCount) {
	  		  System.out.println(" le Zoo est plein ");
	  		  return true ;
	  	  } else {
	  		  System.out.println (" le Zoo n'est pas encore plein");
	  		  return false ;
	  		  
	  	  }		 
	  	 }
	    
	    public void comparerZoo(Zoo z1, Zoo z2) {
	    	if (z1.animalCount > z2.animalCount) {
	    		System.out.println (z1+ " a le plus d'annimaux");
	    	} else if (z1.animalCount < z2.animalCount ) {
	    		System.out.println (z2+" a le plus d'annimaux" ) ;
	    	} else {
	    		System.out.println ("les deux zoo ont le meme nombre d'annimaux ");
	    }
	    	
	    }
	  	 

}
