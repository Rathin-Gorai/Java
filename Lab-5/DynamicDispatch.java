//Write a program to demonstrate Dynamic method dispatch in Java.
class Parente{
    String name;
}
class Child extends Parente {
    String Parente_name;

}
class Son extends Child {
    int age;

}
class DynamicDispatch {
    public static void main(String args[]){
        Child S1 = new Son();
        S1.name= "Rahul";
        S1.Parente_name="Mohit";
        S1.age= 16;
        System.out.println("Name "+S1.name+" Parents name: "+S1.Parente_name+" Age: "+A1.age);
    }
}