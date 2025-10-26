package week6;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Person -> Name: " + name + ", Age: " + age);
    }
}

public class week6_program1 extends Person {
    private int studentId;

    // Student constructor chaining to Person
    public week6_program1(String name, int age, int studentId) {
        super(name, age);            // call Person constructor
        this.studentId = studentId;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        week6_program1 s = new week6_program1("Ranjith", 27, 12345);
        s.showInfo();
    }
}

