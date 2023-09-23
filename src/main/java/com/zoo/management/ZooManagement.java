package com.zoo.management;
import java.util.Scanner;


public class ZooManagement {


	public static void main(String[] args) {
		
	/*   Scanner sc   = new Scanner (System.in);
		System.out.println (" entrez le nombre de cages");
        int nbrCages = sc.nextInt();
        Scanner sc1   = new Scanner (System.in);
        System.out.println (" entrez le nom de zoo");	
        String zooName = sc1.next();
        
        System.out.println (zooName+ " comporte " + nbrCages + " cages ");*/
		
		
		// -------instruction 5 : Maintenant créez deux objets dans la classe principale, un animal (lion) et un zoo (myZoo)  ---------- //
		
	/*  Animal lion = new Animal ();
	lion.family = "cats" ;
	lion.age= 2;
	lion.name="3antér";
	lion.isMammal = true ;
	
    Zoo myZoo = new Zoo () ;
    myZoo.name = "Belvedere";
    myZoo.city = "Tunis" ;
    myZoo.nbrCages = 15 ; 
    
       */  
    //-------instruction 6 :  après l'ajout des constructeurs une erreur s'affiche indiquant ques les deux constructeurs Animal et Zoo sont indéfinis--------------- //
		
	// création des annimaux avec le constructeur parametré // 
	
    Animal lion = new Animal ("cats", "Alex", 2 , false);
    Animal Zebra = new Animal ("horse" , "Marty" , 1 , true );
    Animal Girafe = new Animal ("Girafe" , " Melman ", 3, true);
    
    // -----instruction 8 : 
    
	Zoo myZoo = new Zoo ("belvedere", "Tunis" , 25);

	/* avec ces deux instructions j'ai obtenu le resultat suivante : com.zoo.management.Zoo@61df66b6
       com.zoo.management.Zoo@61df66b6      
       
	System.out.println(myZoo);
    System.out.println(myZoo.toString());
    */	
	System.out.println(myZoo.toString());
	System.out.println(myZoo);
	
	System.out.println(lion);
	System.out.println(Zebra);
	System.out.println(Girafe);
	
	
	myZoo.addAnimal(lion);
	myZoo.addAnimal(Zebra);
	myZoo.addAnimal(Girafe);
	
	//instruction 11
    myZoo.displayAnimals();
     
	
	}
}
