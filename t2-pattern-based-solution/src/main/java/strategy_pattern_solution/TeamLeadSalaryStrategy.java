package strategy_pattern_solution;

public class TeamLeadSalaryStrategy implements SalaryStrategy {

    private final double hourlyRate;
    private final int workedHours;
    private final double monthlyBonus;
    private final double leadershipMultiplier;

    public TeamLeadSalaryStrategy(
            double hourlyRate,
            int workedHours,
            double monthlyBonus,
            double leadershipMultiplier
    ) {
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.monthlyBonus = monthlyBonus;
        this.leadershipMultiplier = leadershipMultiplier;
    }

    @Override
    public double calculateSalary() {
        return workedHours * hourlyRate * leadershipMultiplier + monthlyBonus;
    }
}
