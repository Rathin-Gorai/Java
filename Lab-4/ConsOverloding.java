/*Write a program in Java to demonstrate constructor overloading*/
class Const{
    Const(){
        System.out.println("This is a constructor overloading");
    }
    Const(int i){
        System.out.println("This is a constructor overloading by with paremeter");
    }
}
public class ConsOverloding{
    public static void main(String args[]){ 
        Const c1 = new Const();
        Const c2 = new Const(2);
        }
}