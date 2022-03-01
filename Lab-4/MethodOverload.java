//Write a Java program to demonstrate method overloading.

class Sum{
    Sum(int x, int y){
        int sum = x+y;
        System.out.println(sum);
    }
    Sum(int x, int y,int z){
        int sum = x+y+z;
        System.out.println(sum);
    }
}
public class MethodOverload {
    public static void main(String args[]){
        Sum s1= new Sum(2,3);
        Sum s2= new Sum(5,6,7);
		
    }
    
}
