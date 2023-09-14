
package inheritenceexample;

import java.util.ArrayList;


public class InheritenceExample {

  
    public static void main(String[] args) {
      
        
        
         ArrayList<Animal> animals = new ArrayList<Animal>();
        
         Animal a[]  = new Animal[5]; // created an Animal Array
      
         
         a[0] = new Dog("Fluffy", 20, "Dog", "Pitbull");
         
         a[1] = new Cat("House Cat","Fluffy", 20, "Cat");
         
         a[2] = new Fish(11,"Fluffy", 20, "Fish");
         
         a[3] = new Bird(12,"Fluffy", 20, "Brid");
         
         a[4] = new Dog("Jon Snow", 20, "Dog", "German Sheppard");
         
         
         
         for(int i=0; i<a.length; i++)
         {
             System.out.println("Animal "+ a[i].getType());
             
             if(a[i] instanceof Dog)
             {
                 System.out.println("The dog breed type is "+ ((Dog)a[i]).getBreedType());
             }
             
             else if(a[i] instanceof Cat)
             {
              System.out.println("The Type of cat" + ((Cat)a[i]).getCatType());
             }
             
             else if(a[i] instanceof Fish)
             {
                System.out.println("The Fins Length is "+ ((Fish)a[i]).getFinsLength());
                 
             }
             
             else if(a[i] instanceof Bird)
             {
                System.out.println("The Brid wingth length "+ ((Bird)a[i]).getWingsLenth());
             }
             a[i].move();
        
             a[i].noise();
            
             
          
           
            
           
             
             System.out.println("\n\n");
         }
         
       
          
    }
    
}
