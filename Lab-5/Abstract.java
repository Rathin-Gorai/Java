//Write a Java program to demonstrate abstract class and abstract method.
abstract class Animal{
    abstract void run();
}
class Dog extends Animal{
    public void run(){
        System.out.println("Dog is running!!");
    }
}
public class Abstract{
    public static void main ( String args[]){
        Dog d = new Dog();
        d.run();
    }
}