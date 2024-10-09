package q3;

interface Policy{
	double sal(double sal, double bonus);
	
	double sal(double sal, double bonus, double tax);
}

abstract class Acc implements Policy{
	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	@Override
	public double sal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}
}

class Employee extends Acc{
	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}
}

public class Main{
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.sal(20000, 1000));
		
	}
}
