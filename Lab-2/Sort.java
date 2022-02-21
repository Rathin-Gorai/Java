import java.util.Scanner;

/*Write a Java program to sort an array elements using any sorting algorithm */
public class Sort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j=1; j < (n-i); j++) {
                    if(arr[j-1] > arr[j]) {
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0; i<a;i++){
            System.out.println("Element"+arr[i+1]+": ");
            arr[i] = sc.nextInt();

        }
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
