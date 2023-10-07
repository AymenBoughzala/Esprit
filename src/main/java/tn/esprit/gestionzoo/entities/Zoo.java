package tn.esprit.gestionzoo.entities;

public class Zoo {
	private Animal[] animals;
	private String name;
	private String city;
	private final int nbrCages = 25;
	private int animalCount;
	
	public Zoo( String name, String city, int nbrCages) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
		this.name = name;
	}else {
		System.out.println (" le nom ne doit pas etre vide ");
	}
		}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNbrCages() {
		return nbrCages;
	}

	void displayZoo() {
		System.out.println ("nom : " + name);
		System.out.println ("city : " + city);
		System.out.println ("nbrCages : " + nbrCages);
	}
	 public String toString() {
	        return "Zoo {" +"name='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrCages + '}';
	    }
	 
	 public boolean addAnimal(Animal animal) {
		 if (isZooFull ()) {
			  System.out.println("impossible d'ajouter un nouvel animal.");
			 return false; 
		 } else {
			 animals [animalCount] = animal;
			 animalCount++;
	            return true ;
	        }
	 }
	 public boolean removeAnimal(Animal animal) {
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
	                System.out.println((i + 1) + ". " + animals[i].getName());
	            }
	        }
	 }	 
	 public int searchAnimal(Animal animal) {
	        int index = -1;
	        for (int i = 0; i < animalCount; i++) {
	            if (animal.getName() == animals[i].getName())
	                return i;
	        }
	        return index;
	    }

	 
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
