package day3.polymorphism;

public class Dog extends Animall {
String breed;

 /**
* This is method overloading (two method with same name but diff params) and
* overriding (same name same parameters but from parent)
*/
void eat() {
	super.eat(); //this will be calling  animals eat methode 
System.out.println(super.type + " " + super.name + " is eating");
}

 void eat(String foodName) {
System.out.println(super.type + " " + this.name + " is eating the food item " + foodName);
}

 // Constructor calling the parent constructor - super() method.
public Dog(String name, String type, int weight, String breed) {
// super(name,type);// this will call Animal(String name, String type)
//super(); //this will call Animal() - default constructor
super(name, type, weight); // this will call Animal(String name, String type, String weight)
this.breed = breed;
}
}