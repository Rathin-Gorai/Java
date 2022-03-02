//Write a program to demonstrate Inheritance in Java.
class Fruits{
    String taste;
    String colour;
}
class Apple extends Fruits{
        int weight;
}

public class Inhartitance {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.taste = "Sweet";
        a1.colour ="Red";
        a1.weight=10;
        System.out.println(a1.taste+"\n"+a1.colour+"\n"+a1.weight);

    }
}
