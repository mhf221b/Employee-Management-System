package sample;

import java.util.ArrayList;
public class UapCse {
    ArrayList<Employee> employees = new ArrayList<Employee>();
    String name;
    public UapCse(String n) {
        this.name = n;
    }
    private void addNewEmployee(Employee e) {
        employees.add(e);
    }
    public void addNewEmployee(String n, String I, String d, double s) {
        SalariedEmployee sE = new SalariedEmployee(n, I, d, s);
        addNewEmployee(sE);
    }
    public void addNewEmployee(String n, String I, String d, double hr, int hw) {
        HourlyEmployee hE = new HourlyEmployee(n, I, d, hr, hw);
        addNewEmployee(hE);
    }

    public void addNewEmployee(String n, String I, String d, double p, double s) {
        CommissionEmployee cE = new CommissionEmployee(n, I, d, p, s);
        addNewEmployee(cE);
    }
    private Employee findEmployee(String id){
        for(Employee x : employees){
            if(x.getId().equals(id))
                return x;
        }
        System.out.println("Employee not found!");
        return null;
    }



    public void increaseSalary(String id, double amt){
        Employee x = findEmployee(id);
        if(x!=null){
            x.increaseSalary(amt);
        }
        else
            System.out.println("Employee not found!");
    }

    public double getSalary(String id){
        Employee x = findEmployee(id);
        if(x!=null){
            System.out.println("Salary: " + x.getSalary());
        }
        else {
            System.out.println("Employee not found!");
        }
        return -1;
    }

    public void display(String id) {
        Employee emp=findEmployee(id);
        if(emp!=null) {
            emp.display();
        }
        else {
            System.out.println("Not found");
        }
    }

    public void display() {
        for(int i=0; i<employees.size(); i++) {
            Employee emp=employees.get(i);
            emp.display();
        }
    }
}



