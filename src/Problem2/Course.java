package Problem2;

public class Course {
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;
	
	public Course (String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}
	
	public String toString () {
		return textbook.getTitle() + " " + instructor.getFullName();
	}
	public boolean equals (Object o) {
		if (this.getClass() != o.getClass() || o == null)
            return false;
		Course c = (Course) o;
		if (c.courseTitle.equals(courseTitle))
			return true;
		return false;
	}
	
}
