package com.esprit.prosit1;
import java.util.*;

public class ZooManagement {
	/* static int nbrCages =20;
	static String zooName ="my zoo"; */ //instruction 1

	public static void main(String[] args) {
		/* instruction 1
		System.out.println (zooName+ " comporte " +nbrCages+ "cages") ;*/
		
		
		 Scanner sc   = new Scanner (System.in);
			System.out.println (" entrez le nombre de cages");
	        int nbrCages = sc.nextInt();
	        Scanner sc1   = new Scanner (System.in);
	        System.out.println (" entrez le nom de zoo");	
	        String zooName = sc1.next();
	        
	        System.out.println (zooName+ " comporte " + nbrCages + " cages ");
	
		
		}

}
