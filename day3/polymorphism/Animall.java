package day3.polymorphism;

/**
* To demonstrate the Polymorphism, Method Overloading, Constructor overloading,
* Method overriding, Dynamic method dispatch, super keyword, super() method
*
* @author anbarasuv
*
*/
public class Animall {
String name;
String type; // Wild or Domestic
int weight;


 public Animall(String name, String type) {
super();
this.name = name;
this.type = type;
}

 public Animall(String name, String type, int weight) {
super();
this.name = name;
this.type = type;
this.weight = weight;
}

 void eat() {
System.out.println(this.name + " is eating");
}
}