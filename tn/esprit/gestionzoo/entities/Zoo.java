package tn.esprit.gestionzoo.entities;

public class Zoo {
	private Animal[] animals;
	private String name;
	private String city;
	private final int nbrCages = 3;
	private int animalCount;
	private Aquatic[] aquaticAnimals = new Aquatic [10];
	private int aquaticAnimalCount = 0;
	
	public Zoo( String name, String city, int nbrCages) {
		animals = new Animal[nbrCages];
		this.name = name;
		this.city = city;
	}
	
	public int getAquaticAnimalCount () {
		return aquaticAnimalCount;
	}
	public void setAquaticAnimalCount (int aquaticAnimalCount) {
		this.aquaticAnimalCount= aquaticAnimalCount;
	}
	
	public Aquatic[] getAquaticAnimals() {
		return aquaticAnimals;
	}

	public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
		this.aquaticAnimals = aquaticAnimals;
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
	 
	/* public boolean addAnimal(Animal animal) {
		 if (isZooFull ()) {
			  System.out.println("impossible d'ajouter un nouvel animal.");
			 return false; 
		 } else {
			 animals [animalCount] = animal;
			 animalCount++;
	            return true ;
	        }
	 }*/
	 public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
	        if (animalCount < nbrCages) {
	            if (animal.getAge() >= 0) {
	                animals[animalCount] = animal;
	                animalCount++;
	                System.out.println("Nouvel animal ajouté. Nombre total d'animaux : " + animalCount);
	            } else {
	                throw new InvalidAgeException("L'âge de l'animal est négatif : " + animal.getAge());
	            }
	        } else {
	            throw new ZooFullException("Impossible d'ajouter un nouvel animal, le zoo est plein.");
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

	 
	    /*public boolean isZooFull () {
	  	  if (nbrCages == animalCount) {
	  		  System.out.println(" le Zoo est plein ");
	  		  return true ;
	  	  } else {
	  		  return false ;
	  		  
	  	  }		 
	  	 }*/
	    
	    public void comparerZoo(Zoo z1, Zoo z2) {
	    	if (z1.animalCount > z2.animalCount) {
	    		System.out.println (z1+ " a le plus d'annimaux");
	    	} else if (z1.animalCount < z2.animalCount ) {
	    		System.out.println (z2+" a le plus d'annimaux" ) ;
	    	} else {
	    		System.out.println ("les deux zoo ont le meme nombre d'annimaux ");
	    }
	    	
	    }
	   
	    public void addAquaticAnimal(Aquatic aquatic) {
	    	if (aquaticAnimalCount < aquaticAnimals.length) {
	    		aquaticAnimals [aquaticAnimalCount]= aquatic ;
	    		aquaticAnimalCount++;
	    		System.out.println (aquatic.getName()+" est ajouté avec succés");
	    	}else {
	    		System.out.println (" désolé le zoo est plein ");
	    	}
	    		
	    }
	    
	    public float maxPenguinSwimmingDepth(){
	        float maxDepth =0;
	        for (int i=0;i<aquaticAnimalCount;i++){
	            if(aquaticAnimals[i] instanceof Penguin ){
	                Penguin p = (Penguin) aquaticAnimals[i];
	                if(maxDepth< p.getSwimmingDepth());
	                maxDepth = p.getSwimmingDepth();
	            }
	        }
	        return maxDepth;
	    }
	    
	    public void displayNumberOfAquaticsByType(){
	        int nbrPenguin=0;
	        int nbrDolphin =0;
	        for(int i=0;i<aquaticAnimalCount;i++){
	            if(aquaticAnimals[i] instanceof Penguin){
	                nbrPenguin++;
	            }
	            if(aquaticAnimals[i] instanceof Dolphin){
	                nbrDolphin++;
	            }
	        }
	        System.out.println("le Zoo "+name+"contient :"+nbrPenguin+ "Penguin et " +
	                nbrDolphin+ "Dolphin");
	    }
	    
	    
	    
	  	 

}
