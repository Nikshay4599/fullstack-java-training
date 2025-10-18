package week5;

public class week5_program1 {
    // Encapsulation: keep fields private
    private String brand;
    private String model;
    private int year;

    // Getters/Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // Behavior
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Demo main
    public static void main(String[] args) {
        week5_program1 car = new week5_program1();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2022);
        car.displayInfo();
    }
}

