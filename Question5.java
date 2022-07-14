import java.util.Scanner;
class Question5{
    //question 8
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x,y,z;
        x= scan.nextInt();
        y= scan.nextInt();
        z= scan.nextInt();
        if (x>y && x>z){
            System.out.println("Greatest number is "+x);
        } else if (y>x && y>z){
            System.out.println("Greatest number is "+y);
        } else {
            System.out.println("Greatest number is "+z);
        }
        if (x<y && x<z){
            System.out.println("Smallest number is "+x);
        } else if(y<x && y<z) {
            System.out.println("Smallest number is "+y);
        } else {
            System.out.println("Smallest number is " +z);
        }
    }
}