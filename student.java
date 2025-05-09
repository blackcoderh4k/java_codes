class Stu {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

public class student {
    public static void main(String[] args) {
        Stu student = new Stu();
        student.setName("John Doe");
        student.setMarks(85);
        student.printDetails();
    }

}
