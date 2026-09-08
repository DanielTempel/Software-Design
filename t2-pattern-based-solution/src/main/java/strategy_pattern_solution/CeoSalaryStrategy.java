package strategy_pattern_solution;

public class CeoSalaryStrategy implements SalaryStrategy {

    private final double baseSalary;
    private final double companyProfit;
    private final double performanceBonusRate;

    public CeoSalaryStrategy(
            double baseSalary,
            double companyProfit,
            double performanceBonusRate
    ) {
        this.baseSalary = baseSalary;
        this.companyProfit = companyProfit;
        this.performanceBonusRate = performanceBonusRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + companyProfit * performanceBonusRate;
    }
}