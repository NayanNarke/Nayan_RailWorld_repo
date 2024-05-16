package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
		
		
		ArrayList<Employee>  arrList1 = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee(sc.nextInt(), sc.nextLine(), sc.next());
		
		Employee emp1 = new Employee(12," Jhon", " Had");
		arrList1.add(emp);
		arrList1.add(emp1);
		
		ArrayList<Employee> arrList2 = new ArrayList<>();
		arrList2.add(emp1)	;
		System.out.println(arrList2);
		System.out.println(arrList1);
		
		Collections.sort(arrList1, new EmployeeById());
		System.out.println(arrList1);

	}
	
	public int sum() {
		return 23;
	}

}
