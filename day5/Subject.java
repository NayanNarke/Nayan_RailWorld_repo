package day5;

public class Subject {
	
	private String SubName;

	/**
	 * @param subName
	 */
	public Subject(String subName) {
		SubName = subName;
	}

	public String getSubName() {
		return SubName;
	}

	public void setSubName(String subName) {
		SubName = subName;
	}

	@Override
	public String toString() {
		return "Subject [SubName=" + SubName + "]";
	}
	
	
	
	
	

}
