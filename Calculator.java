import java.util.Scanner;
class Calculator {
    public static void main ( String args[] ){
        System.out.println("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        char c= scanner.nextChar();
        int b= scanner.nextInt();
        switch (c){
            case '+':
            add(a,b);
            break;
            case '-':
            subtract(a,b);
            break;
            case '*':
            multiply(a,b);
            break;
            case '/':
            devision(a,b);
            break;
            case '%':
            remainder(a,b);
            break;
        }
    }
    void add(int x, int y){
        x=x+y;
        System.out.println(x);
    }
    void subtract(int x, int y){
        x=x-y;
        System.out.println(x);
    }
    void multiply(int x, int y){
        x=x*y;
        System.out.println(x);
    }
    void devision(int x, int y){
        x=x/y;
        System.out.println(x);
    }
    void remainder(int x, int y){
        x=x%y;
        System.out.println(x);
    }
}