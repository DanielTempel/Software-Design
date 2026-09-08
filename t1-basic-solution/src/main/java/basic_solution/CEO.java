package basic_solution;

public class CEO extends Employee{

    private final double baseSalary;
    private final double  companyProfit;
    private final double performanceBonusRate;

    public CEO(
            String name,
            double baseSalary,
            double  companyProfit,
            double  performanceBonusRate
    ) {
        super(name);
        this.baseSalary = baseSalary;
        this.companyProfit = companyProfit;
        this.performanceBonusRate = performanceBonusRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary  + companyProfit * performanceBonusRate;
    }

}
