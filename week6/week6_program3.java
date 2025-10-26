package week6;

class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name; this.id = id;
    }

    public void work() {
        System.out.println(name + " (Emp#" + id + ") is doing general tasks.");
    }
}

class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    // override work()
    @Override
    public void work() {
        System.out.println(name + " (Mgr#" + id + ") is managing team and planning.");
    }

    // Manager specific
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}

public class week6_program3 {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 101);
        Employee mAsEmp = new Manager("Bob", 201); // polymorphism

        e.work();
        mAsEmp.work();          // overridden method runs (runtime polymorphism)

        // Downcast to access Manager specific method (safe here because we created a Manager)
        if (mAsEmp instanceof Manager) {
            Manager m = (Manager) mAsEmp;
            m.conductMeeting();
        }
    }
}
