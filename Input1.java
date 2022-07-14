import java.util.Scanner; //compulsory if want to take input from users

class Input1{
    public static void main(String[] args){
        // input from users
        Scanner scan = new Scanner(System.in); //compulsory if want to take input from users


        // add two number
        int num1,num2,sum;
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        sum=num1+num2;


        System.out.println(sum);


    }
}