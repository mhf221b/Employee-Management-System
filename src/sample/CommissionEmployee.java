package sample;


public class CommissionEmployee extends Employee{
    double commission;
    double sale;
    public CommissionEmployee(String n, String i, String d, double c, double s) {
        super(n, i, d);
        this.commission = c;
        this.sale = s;
    }

    public void increaseSalary(double amt) {
        commission = commission + amt;
    }

    public double getSalary() {
        return commission*sale;
    }
    public void display() {
        super.display();
        System.out.printf("Commission: %.2f\n\n", commission*sale);
    }

}
