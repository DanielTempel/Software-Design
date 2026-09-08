package strategy_pattern_solution;

public class FixedSalaryStrategy implements SalaryStrategy{

    private final double monthlySalary;

    public FixedSalaryStrategy(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }


}
