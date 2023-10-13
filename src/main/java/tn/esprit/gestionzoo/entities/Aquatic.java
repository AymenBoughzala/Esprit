package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
  
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

   
}