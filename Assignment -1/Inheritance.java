class Inheritance{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.bark();
		d1.run();
		Cat c1 = new Cat();
		c1.meow();
		c1.run();
	}
}
 class Animal{
	void run(){
		System.out.println("I am running..");
	}
}
 class Dog extends Animal{
	void bark(){
		System.out.println("Bho Bho..");
	}
}
 class Cat extends Animal{
	void meow(){
		System.out.println("Meow Meow..");
	}
}