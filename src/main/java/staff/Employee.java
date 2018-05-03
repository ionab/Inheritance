package staff;

public abstract class Employee {
    private String name;
    private String niNUmber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNUmber = niNumber;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiNUmber() {
        return niNUmber;
    }

    public void setNiNUmber(String niNUmber) {
        this.niNUmber = niNUmber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        setSalary(this.salary + raise);
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}