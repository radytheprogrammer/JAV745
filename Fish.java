
package inheritenceexample;


public class Fish extends Animal
{
    private double finsLength;
    
    public Fish()
    {
        
    }

    public Fish(double finsLength, String name, double weight, String type) {
        super(name, weight, type);
        this.finsLength = finsLength;
    }
    
    
   
    public Fish(double finsLength) {
        this.finsLength = finsLength;
    }

    public double getFinsLength() {
        return finsLength;
    }

    public void setFinsLength(double finsLength) {
        this.finsLength = finsLength;
    }
    
    
    
    @Override
    public void move()
    {
        System.out.println("Swim");
    }

    @Override
    public void noise() {
        System.out.println("Bloop");
    }
    

    

    
    
    
    
}
