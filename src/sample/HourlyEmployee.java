package sample;


public class HourlyEmployee extends Employee{
    double hourlyRate;
    int hourWorked;
    public HourlyEmployee(String n, String i, String d, double hR, int hW) {
        super(n, i, d);
        this.hourlyRate = hR;
        this.hourWorked = hW;
    }

    public void increaseSalary(double amt) {
        hourlyRate = hourlyRate + amt;
    }

    public double getSalary() {
        return hourWorked*hourlyRate;
    }

    public void display() {
        super.display();
        System.out.printf("Rate: %.2f\n\n", hourWorked*hourlyRate);
    }

}
