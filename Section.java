package funcs;

public class Section extends Course{
	
	
	String lecturer;
	String location;
	int section_number;
	String timing;
	String type;
	
	public Section(String course_Name, String course_Department, int course_credit, int CRN, String lecturer, String location, int section_number, String timing, String type) {
		super(course_Name, course_Department, course_credit, CRN);

		this.lecturer = lecturer;
		this.location = location;
		this.section_number = section_number;
		this.timing = timing;
		this.type = type;
	}
	
	public String toString() {
		String s = course_Name+"\t"+timing+"\t"+lecturer+"\t"+location+"\t"+course_credit+"\t"+CRN+"\t"+type;
		return s;
	}
	
}
