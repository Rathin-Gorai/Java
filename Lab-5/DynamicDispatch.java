//Write a program to demonstrate Dynamic method dispatch in Java.
class Parente{
    void display(){
		System.out.println("This is Parents");
	}
}
class Child extends Parente {
    void display(){
		System.out.println("This is Child");
	}
}
class Son extends Child {
    void display(){
		System.out.println("This is Son");
	}
}
class DynamicDispatch {
    public static void main(String args[]){
        Parente P = new Parente();
		Child C = new Child();
		Son S = new Son();
		Parente Ref; //What is this
		Ref = P;
		Ref.display();
		Ref = C;
		Ref.display();
		Ref = S;
		Ref.display();
    }
}