import java.util.Scanner;
//Question 4
class Question4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        if(x % 3 == 0 && x % 5 == 0) {
            System.out.println("The Number is Divisable by 3 and 5 also");
        } else if( x%3 ==0){
            System.out.println("The Number is Divisable by 3 and not divisible by 5");
        } else if (x % 5 == 0) {
            System.out.println("The Number is Divisable by 5 and not divisible by 3");
        }
    }
}