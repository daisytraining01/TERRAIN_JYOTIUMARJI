package com.indivisual.activity;

class Animal{
	private String colour;
	private String name;
	
	//default constructor
	public Animal(){
		
	}
	
	//parameterized constructor
	public Animal(String colour, String name) {
		super();
		this.colour = colour;
		this.name = name;
	}
	//setter and getters of instance variable from which we can achive Encapsulation
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
// dog class extending animal class we can achive here inheritance
class Dog extends Animal{
	
	double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double d) {
		this.weight = d;
	}
	
	
}

public class OopsConcepts {

	public static void main(String[] args) {

             Animal a1=new Animal();
             Animal a2=new Animal("cat", "black");
             
             a1.setName("goat");
             a1.setColour("brown");
             
             Dog d1=new Dog();
             d1.setName("dogbrown");
             d1.setColour("white");
             d1.setWeight(5.5);
            
           Animal d2=new Dog();
           
           d2.setName("dogBlack");
           d2.setColour("black");
           
           
           System.out.println(a2.getColour());
           
           System.out.println(a2.getName());

	}

}
