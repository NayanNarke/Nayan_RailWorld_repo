package day5;

public class Student {
	
	private String StdName ;
	private int StdId ;
	private School school ;
	private Subject subject;

	
	public Student(String stdName, int stdId, School school, Subject subject) {
		StdName = stdName;
		StdId = stdId;
		this.school = school;
		this.subject = subject;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [StdName=" + StdName + ", StdId=" + StdId + ", school=" + school + ", subject=" + subject + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
