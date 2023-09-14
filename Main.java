
package inheritenceexample;

import java.util.ArrayList;


public class ArralyListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
         ArrayList<Animal> animals = new ArrayList<Animal>();

         Dog d = new Dog();
         
        System.out.println(d);
         
         animals.add(new Dog("Fluffy", 20, "Dog", "Pitbull"));
         
         animals.add(new Cat("House Cat","Fluffy", 20, "Cat"));
         
        animals.add(new Fish(11,"Fluffy", 20, "Fish"));
         
        animals.add(new Bird(12,"Fluffy", 20, "Brid"));
         
        animals.add(new Dog("Jon Snow", 20, "Dog", "German Sheppard"));
         
         
         
         for(int i=0; i<animals.size(); i++)
         {
             System.out.println("Animal "+ animals.get(i).getType());
             
             if(animals.get(i) instanceof Dog)
             {
                 System.out.println("The dog breed type is "+ ((Dog)animals.get(i)).getBreedType());
             }
             
             else if(animals.get(i) instanceof Cat)
             {
              System.out.println("The Type of cat" + ((Cat)animals.get(i)).getCatType());
             }
             
             else if(animals.get(i)instanceof Fish)
             {
                System.out.println("The Fins Length is "+ ((Fish)animals.get(i)).getFinsLength());
                 
             }
             
             else if(animals.get(i) instanceof Bird)
             {
                System.out.println("The Brid wingth length "+ ((Bird)animals.get(i)).getWingsLenth());
             }
             animals.get(i).move();
        
             animals.get(i).noise();
            
             
          System.out.println("\n\n");
           
            
         } 
             
             
    }
    
}
