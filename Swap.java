import java.util.Scanner;

/*1.	Accept a three digit number from the user (100 to 999). First, check that the number has
 only three digits. Then separate each digit of the number and then arrange them in the reverse
  order such that the middle digit remains the same and first and third digit are swapped.
Example -
Input: 347
Output: 743
*/

public class Swap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int newNum = num % 10;
        int newNum2 = (num %100)/10;
        int newNum3 = num /100;
        System.out.print(newNum);
        System.out.print(newNum2);
        System.out.print(newNum3);
        sc.close();
    }
}
