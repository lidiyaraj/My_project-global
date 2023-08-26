package project2;

abstract class Employee2 {
abstract void getname();
}
class Department extends Employee2{
	void getname(){System.out.println("wages of employees");}
	public static void main(String[] args) {
		Employee2 obj=new Department();
		obj.getname();
		

	}

}
