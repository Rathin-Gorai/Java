public class SuperKey{
	public static void main(String[] args){
		Apple a1 = new Apple();
		a1.purchase();
	}
}
class Fruits{
	int count = 20;
}
class Apple extends Fruits{
	int weight = 1;
	int count =10;
	void purchase(){
		
		System.out.println(super.count);
		//System.out.println("Take your "+weight+"kg of "+super.count+" apples");
	}
}