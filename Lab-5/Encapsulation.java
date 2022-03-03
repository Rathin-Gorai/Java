//Write a program to demonstrate Ecapsulation in Java.
class Student{
    private String name;
    void setname(String a){
        name = a;
    }
    String getname(){
        return name;
    }
}
class Encapsulation {
    public static void main (String args[]){
        Student S1 = new Student();
        S1.setname("Rahul");
        System.out.println("Name:"+S1.getname());
    }
}