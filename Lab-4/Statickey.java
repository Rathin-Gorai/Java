/*Write a Java program to demonstrate Static Keyword.*/
class Employee{
    static String brand="RVS";
    static void company(){
        brand ="MITM";
    }
    String name;
    int joining_date;
    

}
public class Statickey {
    public static void main(String args[]){
        Employee e1= new Employee();
        e1.name="Rahul";
        e1.joining_date=2000;
        Employee.company();
        System.out.println(e1.name+" "+e1.joining_date+" "+Employee.brand);
    }
    
}
