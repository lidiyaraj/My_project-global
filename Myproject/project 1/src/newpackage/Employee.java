package newpackage;

public class Employee {
	int id;
	String name;
	Employee(int i,String n){
		id=i;
		name=n;
	}
void display() {System.out.println(id+" "+name);}
	public static void main(String[] args) {
		Employee e=new Employee(34,"Aijith");
		e.display();
		
		                                    

	}

}

