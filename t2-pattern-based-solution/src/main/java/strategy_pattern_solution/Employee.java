package strategy_pattern_solution;

public class Employee {

    private final String name;
    private final String role;
    private SalaryStrategy salaryStrategy;

    public Employee(
            String name,
            String role,
            SalaryStrategy salaryStrategy
    ) {
        this.name = name;
        this.role = role;
        this.salaryStrategy = salaryStrategy;
    }

    public double calculateSalary() {return salaryStrategy.calculateSalary();
    }

    public void setSalaryStrategy(SalaryStrategy salaryStrategy) {
        this.salaryStrategy = salaryStrategy;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

}