package oop3;

class Faculty {
	 private String name;
	 private int id;
	 private String department;
	 private Course course;  
	 public Faculty(String name, int id, String department, Course course) {
	     this.name = name;
	     this.id = id;
	     this.department = department;
	     this.course = course;
	 }
	
	 public String getName() {
	     return name;
	 }
	
	 public int getId() {
	     return id;
	 }
	
	 public String getDepartment() {
	     return department;
	 }
	
	 public Course getCourse() {
	     return course;
	 }
	
	 public void setCourse(Course course) {
	     this.course = course;
	 }
	 public void grading(Student student, String grade) {
	     if (course != null) {
	         student.addCourseGrade(course.getCourseName(), grade);
	         System.out.println("Faculty " + name + " assigned grade " + grade 
	                            + " to student " + student.getName() 
	                            + " for course " + course.getCourseName());
	     } else {
	         System.out.println("Faculty " + name + " has no assigned course.");
	     }
	 }
}


