import java.util.Scanner;

//6. Write a Java program to demonstrate weekdays using Switch case.
public class WeekDay {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        switch (ver) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid weekday");
        }
        sc.close();
    }
    
}
