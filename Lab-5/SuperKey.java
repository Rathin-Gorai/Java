//Write a program to demonstrate the use of Super Keyword.

class Fruits{
    String name="Apple";
}
class Apple extends Fruits{
    String name;
    int weight;
    public void viewall(){
        System.out.println(super.name+" "+weight);
    }

}
public class SuperKey {
    public static void main(String args[]){
        Apple a1 = new Apple();
        a1.name = "Rathin";
        a1.weight =200;
        a1.viewall();
    }
    
}
