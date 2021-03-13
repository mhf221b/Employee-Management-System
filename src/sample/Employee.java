package sample;


public abstract class Employee {
    private String name;
    private String id;
    private String designation;

    public Employee(String n, String i, String d) {
        this.name = n;
        this.id = i;
        this.designation = d;
    }

    public void display(){
        System.out.printf("Name: %s\nId: %s\nDesignation: %s\n\n", name, id, designation);
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return designation;
    }

    public abstract double getSalary();

    public abstract void increaseSalary(double amt);







}

