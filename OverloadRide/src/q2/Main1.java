package q2;

class Emp{
	
	public int sal(int sal) {
		return sal;
	}	
	
	public int sal(int sal, int bonus) {
		return sal + bonus;
	}
}

class Manager{
	
	public int sal(int sal, int bonus, int tax) {
		return sal + bonus - tax;
	}
}

public class Main1 {
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		Manager manager = new Manager();
		System.out.println(emp.sal(20000));;
		System.out.println(emp.sal(20000,10000));
		System.out.println(manager.sal(30000, 10000, 5000));
		
	}
	
	
}
