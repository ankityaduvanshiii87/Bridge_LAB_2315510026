package oop3;

import java.util.*;

class Student{
    private String name;
    private int id;
    private String email;
    private String gender;
    private HashMap<String, String> courseGrades; 
    public Student(String name, int id, String email, String gender) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.courseGrades = new HashMap<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addCourseGrade(String course, String grade) {
        courseGrades.put(course, grade);
    }
    public String getGrade(String course) {
        return courseGrades.getOrDefault(course, "Not Enrolled");
    }
    public void displayCourses() {
        System.out.println("Courses and Grades for " + name + ":");
        for (Map.Entry<String, String> entry : courseGrades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public void displayStudentInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}



