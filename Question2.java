import java.util.Scanner;
// question 3
class Question2
{
    public static void main(String args[]){
        int x,y,z;
        Scanner scan= new Scanner (System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
         // && this s symbol of and operator 
        if(x==y && x==z){
            System.out.println("All the numbers are equal");
        } else {
            if (x>y && x>z){
                System.out.println("Greatest number is "+x);
            } else if (y>x && y>z){
                System.out.println("Greatest number is "+y);
            } else if (z>x && z>y) {
                System.out.println("Greatest number is "+z);
            }
        }
    }
}