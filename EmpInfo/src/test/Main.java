package test;

class Emp{
	
	String name = "Sneha";
	int id = 123;
	float sal = 20000;
	String address = "Mumbai";
	
	public void display_info() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display_info();
		System.out.println(emp);
	}
	
	
}
