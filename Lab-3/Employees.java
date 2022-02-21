/* Write a program that would print the information (name, year of joining,
 salary, address) of three employees by creating a class named 'Employee'.
  The output should be as follows: Name year address
    Rahul   2001    Tata
    Sachin  2000    galudih
    Sourav  2000    patna
*/

class Employee{
    String name;
    int joining_date;
    String address;
}

public class Employees {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.name = "Rahul";
        e1.joining_date=2001;
        e1.address = "Tata";
        Employee e2 = new Employee();
        e2.name = "Sachin";
        e2.joining_date=2000;
        e2.address = "Galudih";
        Employee e3 =new Employee();
        e3.name = "Sourav";
        e3.joining_date=2000;
        e3.address = "Patna";
        System.out.println(e1.name+"     "+e1.joining_date+"    "+e1.address);
        System.out.println(e2.name+"    "+e2.joining_date+"    "+e2.address);
        System.out.println(e3.name+"    "+e3.joining_date+"    "+e3.address);
    }
}