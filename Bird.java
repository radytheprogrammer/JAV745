
package inheritenceexample;


public class Bird extends Animal 
{
    private double wingsLenth;
    
    public Bird()
    {
        
    }

    
    
    public Bird(double wingsLenth) {
        this.wingsLenth = wingsLenth;
    }

    public Bird(double wingsLenth, String name, double weight, String type) {
        super(name, weight, type);
        this.wingsLenth = wingsLenth;
    }
    
    
    

    public double getWingsLenth() {
        return wingsLenth;
    }

    public void setWingsLenth(double wingsLenth) {
        this.wingsLenth = wingsLenth;
    }
    
    
    @Override
    public void move()
    {
        System.out.println("Flys");
    }

    @Override
    public void noise() {
        System.out.println("Chirp");
    }
    

    
}
