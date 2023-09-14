
package inheritenceexample;


public class Dog extends Animal 
{
    private String breedType;

    
    public Dog()
    {        
    
    }
    public Dog(String breedType) {
        this.breedType = breedType;
    }
    
    public Dog(String name, double weight, String type , String breedType)
    {
       super(name,weight,type);
       this.breedType = breedType;
  
    }
    

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    @Override
    public void noise() {
        System.out.println("Barks");
    }

    @Override
    public String toString() {
        return "Dog{" + "breedType=" + breedType + "\nname="+this.getName() + "\nweight "+this.getWeight() + "\n" + '}';
    }
    
    

    
    
  
    
    
}
