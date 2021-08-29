package day3.polymorphism;

/**
* To demonstrate the Polymorphism, Method Overloading, Constructor overloading,
* Method overriding, Dynamic method dispatch, super keyword, super() method
*
*
* @author Mani
*
*/
public class Petshop {

 /**
* 1. Create animal object and call eat method..
* 2. Create dog object but assign to Animal class reference and call eat method
* 3. Convert object in step #2 to Dog class reference and call eat(food) method
* @param args
*/
public static void main(String[] args) {
Animall a = new Animall("Lion", "Wild", 100);
a.eat();
Animall a2 = new Dog("Dog", "Domestic", 15, "Bull Dog");
a2.eat();
Dog dog = (Dog) a2; // cast or converting
dog.eat("Pedigree");
}

}