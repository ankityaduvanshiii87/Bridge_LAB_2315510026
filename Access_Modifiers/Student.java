package Best_Practices_in_Constructors.Access_Modifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(36, "Pushpendra", 7.5);
        pg.display();
        pg.setCGPA(9.0);
        pg.display();
    }
}

