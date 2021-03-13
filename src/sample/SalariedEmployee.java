package sample;


public class SalariedEmployee extends Employee{
    double monthlySalary;
    public SalariedEmployee(String n, String i, String d, double m) {
        super(n, i, d);
        this.monthlySalary = m;

    }

    public void increaseSalary(double amt) {
        monthlySalary = monthlySalary + amt;
    }

    public double getSalary() {
        return monthlySalary;
    }

    public void display() {
        super.display();
        System.out.printf("Salary : %.2f\n\n", monthlySalary);




    }


}
