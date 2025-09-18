package oop3;


class Course {
    private String courseName;
    private String courseId;
    private int credit;
    public Course(String courseName, String courseId, int credit) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.credit = credit;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    public void displayCourse() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Credit: " + credit);
    }
}
