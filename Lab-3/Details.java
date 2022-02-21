/* Create a class named 'Student' with String variable 'name' and integer variable 
'roll_no'. Assign the value of roll_no as 'your roll no.' and that of name as "your name"
 by creating an object of the class Student. */


class Student{
    String name;
    int roll_no;
}
public class Details{
    public static void main(String args[]){
        Student student1 = new Student();
        student1.name = "Rathin Kumar Gorai";
        student1.roll_no = 18;
        System.out.println("Name "+student1.name+" Roll No "+student1.roll_no);
    }
}