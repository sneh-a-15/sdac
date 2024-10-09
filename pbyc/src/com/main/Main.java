package com.main;

import com.emp.Emp;
import com.manager.Manager;

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp();
	Manager manager = new Manager();
	
	System.out.println(emp.sal(20000, 5000));
	System.out.println(manager.sal(20000, 12000, 5000));
}
}
