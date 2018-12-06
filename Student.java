package funcs;

import java.util.ArrayList;

public class Student extends User{
	
	boolean approval_Status;
	ArrayList<Section> sections = new ArrayList<Section>();
	
	static Student t = new Student("MedYaya","201676520","rs7070",true);
	
	public Student(String user_Name, String id, String password, boolean approval_Status) {
		super(user_Name, id, password);
		this.approval_Status = approval_Status;
	}
	
	public void add_Course(Section some_Section) {
		if(approval_Status == true)
			sections.add(some_Section);
	}
	
	public void drop_Course(Section some_Section) {
		if(approval_Status == true)
			sections.remove(some_Section);
	}
	
	public void reveal_Courses() {
		System.out.println(sections);
	}
	
	public String get_Approval_Status() {
		if(approval_Status == true)
			return "Approved";
		else return "Not Approved";
	}
	
}
