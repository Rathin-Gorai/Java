import java.util.Scanner;
//Write a Java program to print factorial of a number.
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int Factorial=1;
        for(int i = 1; i <=a;i++){
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
        sc.close();
    }
    
}
