import java.util.Scanner;

public class Matric {
    public static void main(String[] args)
    {
        int arr[],arr1[],sum[];
        Scanner var = new Scanner(System.in);
        System.out.println("3x3 Matrix Operation\n Enter The first matrix values");
        for(int i=0;i<=9;i++) 
        {
            System.out.println("Element "+i+1+"=");
            arr[i]=var.nextInt();
        }
        System.out.println("Enter The second matrix values");
        for(int i=0;i<=9;i++) 
        {
            System.out.println("Element "+i+1+"=");
            arr1[i]=var.nextInt();
            sum[i]=arr[i]+arr1[i];
        }
        for(int i=0;i<=9;i++) 
        {
            System.out.println("sum of Element "+i+1+"="+sum[i]);
        }
        var.close();
    }
    
}
