//Write a Java program to demonstrate This keyword.
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class ThisKey {
    public static void main(String[] args) {
        Student S1 = new Student("Rathin",12);
        System.out.println(S1.name+" "+S1.age);
        
    }
    
}
