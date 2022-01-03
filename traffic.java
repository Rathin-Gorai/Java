import java.util.Scanner;

/*Let us write a basic program to help Traffic Police. When the traffic light turns Green you need to tell traffic "You are allowed to move" and if the signal is either Red or Yellow you need to tell traffic "Please stop!".

You need to write two programs using:
1. IF-ELSE and
2. Ternary Operator.
*/
class traffic {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the colour:");
        String color = scan.nextLine();
        if(color.equals("GREEN"))
        System.out.println("You are allowed to move");
        else
        System.out.println("Please stop!");
        scan.close();
    }
}