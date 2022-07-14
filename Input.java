import java.util.Scanner;
class Input{
    public static void main(String[] args){
        // take input from user
        Scanner scan = new Scanner(System.in);
        
        String name;
        System.out.print("Enter Your name:");
        name = scan.nextLine();

        System.out.println("Your name is "+name);
    }
}