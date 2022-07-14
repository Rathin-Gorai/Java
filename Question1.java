import java.util.Scanner;
//question 1
class Question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y,z, sum;


        System.out.println("Enter three angles of traingle: ");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        sum=x+y+z;
        // || this is the symbol of OR
        if(sum==180){
            if(x==90 || y==90 ||z==90){
                System.out.println("Right-Angle Traingle");
            } else {
                System.out.println("Obtuse-Angle Traingle");
            }
        } else {
            System.out.println("A traingle is not possible");
        }
    }
}