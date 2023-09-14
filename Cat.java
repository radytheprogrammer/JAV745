/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

public class Cat extends Animal 
{
    private String catType;

    public Cat() {
         
    }

    public Cat(String catType, String name, double weight, String type) {
        super(name, weight, type);
        this.catType = catType;
    }

    
    
    public Cat(String catType) {
        this.catType = catType;
    }
    
    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public void noise() {
        System.out.println("Meows");
    }
    


    
    
}
