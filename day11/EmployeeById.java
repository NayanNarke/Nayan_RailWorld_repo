package day11;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getEmpInt(),o2.getEmpInt());

}	
	}





