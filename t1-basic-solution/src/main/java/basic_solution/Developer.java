package basic_solution;

public class Developer extends Employee{

    private final double monthlySalary;

    public Developer(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary ;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
