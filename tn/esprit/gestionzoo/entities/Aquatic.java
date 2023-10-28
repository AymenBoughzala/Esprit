package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {

    protected String habitat;
    
    public Aquatic() {
    }

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

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof Aquatic){
            Aquatic a = (Aquatic) obj;
            return this.getName()== a.getName() && this.getAge()==a.getAge() &&
                    this.habitat==a.habitat;
        }
        return false;
    }

    
   
}