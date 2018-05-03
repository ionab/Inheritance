package staff.management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String niNumber, double salary, String department, double budget) {
        super(name, niNumber, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
