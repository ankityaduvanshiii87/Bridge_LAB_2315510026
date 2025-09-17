package Inheritence.Multilevel_Inheritance;

class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}
public class MainCourse {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("DSA", 60, "Udemy", true, 4999, 20);
        System.out.println(poc.courseName + " " + poc.platform + " Rs." + poc.fee);
    }
}

