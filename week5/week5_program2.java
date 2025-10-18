package week5;

public class week5_program2 {
    // Encapsulation
    private String name;
    private int marks1, marks2, marks3;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setMarks(int m1, int m2, int m3) {
        this.marks1 = m1; this.marks2 = m2; this.marks3 = m3;
    }

    public double calculatePercentage() {
        double total = marks1 + marks2 + marks3;     // out of 300
        return (total / 300.0) * 100.0;
    }

    public void printReport() {
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
    }

    public static void main(String[] args) {
        week5_program2 s = new week5_program2();
        s.setName("Ranjith");
        s.setMarks(85, 90, 80);
        s.printReport();
    }
}

