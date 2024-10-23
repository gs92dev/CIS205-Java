public class MainClass {
    public static void main(String[] args) {

        Student student1 = new Student("Guilherme", "123", "kjfds", 10);
        System.out.println(student1);

        // student1.printStudent();
        student1.setName("Guilherme2");
        student1.setId("1234");

        student1.toString();

        System.out.println(student1);

        System.out.println(student1.getName());

    }
}
