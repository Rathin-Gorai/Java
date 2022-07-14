import java.util.Scanner;
class Question3{
    // Question 5
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        x= scan.nextInt();
        if (x % 4 == 0){
            if(x % 100==0){
                System.out.println("Its a century leap year");
            } else {
                System.out.println("Its a leap year");
            }
        } else {
            System.out.println("Not a Leap year");
        }
    }
}