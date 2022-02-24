//Write a program to demonstrate Inheritance in Java.
class Animal{
    String type= "Animal";
}
class Dog extends Animal{
    String name;
    int weight;
}
public class Inheritance {
    public static void main(String args[]){
        Dog D1 = new Dog();
        D1.name = "Labredor";
        D1.weight=20;
        System.out.println(D1.name+" "+D1.weight+ " "+D1.type);
    }
    
}
