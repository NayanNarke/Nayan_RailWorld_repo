package day9;

public class Student implements Comparable<Student>{
	
	private String name;
	private int marks;
	
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public int compareTo(Student o) {
		
		if(this.marks > o.getMarks()) {
			return 1;
		}else if(this.marks < o.getMarks()) {
			return -1;
		}else {
			return 0;
			
		}

	
}

	public static void main(String[] args) {
		Student std1 = new Student("Stark ", 89);
		Student std2 = new Student("Bob ", 90);
		
		int comparision= std1.compareTo(std2);
		
		if(comparision > 0) {
			System.out.println(std1.getName() + " Got Higher Marks then " + std2.getName());
		}else if (comparision < 0) {
            System.out.println(std1.getName() + " got less marks than " + std2.getName());
        } else {
            System.out.println(std1.getName() + " got equal marks with " + std2.getName());
        }
	}


	
	}
