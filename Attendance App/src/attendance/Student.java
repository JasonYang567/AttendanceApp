package attendance;

public class Student implements Attendee{

	private String first;
	private String last;
	private boolean studentIsPresent;
	
	public Student(String firstname, String lastname) {
		this.first = firstname;
		this.last = lastname;
	}
	
	public boolean isPresent() {
		return studentIsPresent;
	}

	public void setPresent(boolean present) {
		this.studentIsPresent = present;
	}

	public String getFirstName() {
		return first;
	}

	public String getLastName() {
		return last;
	}

	public boolean matches(String first, String last) {
		return first.toLowerCase().equals(first.toLowerCase()) && last.toLowerCase().equals(last.toLowerCase());
	}

	public boolean matches(String last) {
		return last.toLowerCase().equals(last.toLowerCase());
	}

	public String getReportString() {
		String s1 = last;
		String s2 = first;
		
		while (s1.length() < 20) {
			s1 += " ";
		}
		while (s2.length() < 20) {
			s2 += " ";
		}
		
		if (studentIsPresent) {
			return s1 + s2 + "PRESENT";
		}
		return s1 + s2 + "ABSENT";
		
	}

}
