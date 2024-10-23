public class Student {

    private String name;
    private String id;
    private String email;
    private int grade;

    public Student(String n, String i, String e, int g) {
        name = n;
        id = i;
        email = e;
        grade = g;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    // public void printStudent() {
    // System.out.println("Name: " + name);
    // System.out.println("ID: " + id);
    // System.out.println("Email: " + email);
    // System.out.println("Grade: " + grade);
    // }
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nEmail: " + email + "\nGrade: " + grade;
    }

}
