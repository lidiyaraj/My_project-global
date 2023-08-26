package project2;

public class Single_inheritance {

		void eat() {System.out.println("eating...");}
	}
	class Dog extends Single_inheritance{
		void bark(){System.out.println("barking...");}
	}
	class Testinheritance{
		public static void main(String[] args) {
			Dog d=new Dog();
			d.bark();
			d.eat();
			
		
	}

	

}
