package day5;

public class School {
	private String SchoolName;

	/**
	 * @param schoolName
	 */
	public School(String schoolName) {
		SchoolName = schoolName;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	@Override
	public String toString() {
		return "School [SchoolName=" + SchoolName + "]";
	}
	
	
	
	
}








