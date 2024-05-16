package day11;

public class Employee {
	
	private int empInt;
	private String empName;
	private String empPosition;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empInt, String empName, String empPosition) {
		this.empInt = empInt;
		this.empName = empName;
		this.empPosition = empPosition;
	}
	public int getEmpInt() {
		return empInt;
	}
	public void setEmpInt(int empInt) {
		this.empInt = empInt;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	
	@Override
	public String toString() {
		return "Employee [empInt=" + empInt + ", empName=" + empName + ", empPosition=" + empPosition + "]";
	}
	
	

}
