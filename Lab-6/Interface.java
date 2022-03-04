//Write a Java program that creates an Interface and implement it.
interface Animal{
    public void eat();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}
public class Interface{
    public static void main(String args[]){
        Animal d = new Dog();
        d.eat();
    }
}