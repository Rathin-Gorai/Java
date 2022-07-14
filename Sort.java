import java.util.Scanner;

/*1.	Write a program to accept an array of integers from the user. 
After accepting the input, arrange the elements in such a way that the 
largest element is at the last index and the smallest is at the 0th index. 
The first line of input will denote the number of elements in the array 
followed by the elements. Finally, output the re-arranged array in ascending order.
Example -
Input: 5
64 1 32 978 12
Output: 1 12 32 64 978
*/
public class Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
    }
}
