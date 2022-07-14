import java.util.Scanner;

public class Value {
    
    // Write a Java program to read the value of an integer 
    //m and display the value of n is 1 when m 
    //is larger than 0, 0 when m is 0 and -1 when m is less than 0
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        // if m =-545 then n=-1 
        // if m = 5458 then n= 1
        // if m=0 the n = 0
        
        int m,n=1;
        m=scan.nextInt();
        
        if(m < 0){
            n=-1;
        } 
        else if(m==0){
            n=0;
        } 
        else if (m>0){
            n=1;
        }

        System.out.println(n);
    }
}