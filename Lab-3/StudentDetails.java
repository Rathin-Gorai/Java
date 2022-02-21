/* Assign and print the roll number, phone number and address of two students
having names "Sam" and "John" respectively by creating two objects of class 'Student'. */
class Student{
    int roll_no;
    long mobileNumber;

}
public class StudentDetails {
    public static void main(String[] args){
        Student Sam = new Student();
        Student John = new Student();
        Sam.roll_no =12;
        Sam.mobileNumber=222222222;
        John.roll_no =14;
        John.mobileNumber=1111111111;
        System.out.println("Sam " + Sam.roll_no+" " + Sam.mobileNumber);
        System.out.println("John " + John.roll_no+" " + John.mobileNumber);
    }

}
