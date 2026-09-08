package basic_solution;

public class TeamLead extends Employee{

    private final double hourlyRate;
    private final int workedHours;
    private final double monthlyBonus;
    private final double leadershipMultiplier;

    public TeamLead(
            String name,
            double hourlyRate,
            int workedHours,
            double monthlyBonus,
            double leadershipMultiplier
    ) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.monthlyBonus = monthlyBonus;
        this.leadershipMultiplier = leadershipMultiplier;
    }

    @Override
    public double calculateSalary() {
        return workedHours * hourlyRate * leadershipMultiplier + monthlyBonus ;
    }

}
