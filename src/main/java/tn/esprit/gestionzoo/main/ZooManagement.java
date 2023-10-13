package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
/*import java.util.Scanner; */


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
    Animal Monkey = new Animal ("monkeys" , " Jack ", 4, true);
    Animal lion2 = new Animal ("cats", "Alexa", 6 , false);
    
    // -----instruction 8 : 
    
	Zoo myZoo = new Zoo ("belvedere", "Tunis" , 25);
	Zoo myZoo2 = new Zoo ("Nahli ", "Ariana" , 25);

	/* avec ces deux instructions j'ai obtenu le resultat suivante : com.zoo.management.Zoo@61df66b6
       com.zoo.management.Zoo@61df66b6      
       
	System.out.println(myZoo);
    System.out.println(myZoo.toString());
    */	
	System.out.println(myZoo.toString());
	System.out.println(myZoo2.toString());
	
	System.out.println(lion);
	System.out.println (lion2);
	System.out.println(Zebra);
	System.out.println(Girafe);
	System.out.println(Monkey);
	
	
	myZoo.addAnimal(lion);
	myZoo.addAnimal(lion2);
	myZoo.addAnimal(Zebra);
	myZoo.addAnimal(Girafe);
	myZoo.addAnimal(Monkey);
	
	System.out.println(myZoo.searchAnimal(lion2));
	System.out.println(myZoo.removeAnimal(Girafe));
	
	//instruction 11
    myZoo.displayAnimals();
    //instruction 15

    
	myZoo2.addAnimal(lion);
	myZoo2.addAnimal(lion2);
	myZoo2.addAnimal(Zebra);
	
	myZoo2.displayAnimals();
	
	myZoo.comparerZoo ( myZoo2,myZoo);
	
	Aquatic aquatic = new Aquatic("aquatic", "Whale", 1, true, "Sea");
    Terrestrial terrestrial = new Terrestrial("Cats ", "Tiger", 5, true, 4);
    Dolphin dolphin = new Dolphin("Dolphin", "Billey", 5, true, "Ocean", 10);
    Penguin penguin = new Penguin("Penguin", "pang", 3, true, "Ocean", 5);

    System.out.println(aquatic);
    System.out.println(terrestrial);
    System.out.println(dolphin);
    System.out.println(penguin);
	
    aquatic.swim();
    dolphin.swim();
    penguin.swim();
    
	}
}
