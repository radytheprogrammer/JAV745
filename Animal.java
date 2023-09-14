
package inheritenceexample;


public abstract class Animal 
{
    protected String name;
    protected double weight;
    protected String type;
    
    public Animal()
    {
    
    }

    public Animal(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void move()
    {
        System.out.println("Run");
    }
    
    
    public abstract void noise();

    
    

    
}
