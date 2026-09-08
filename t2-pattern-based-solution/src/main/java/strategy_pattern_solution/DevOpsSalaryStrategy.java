package strategy_pattern_solution;

public class DevOpsSalaryStrategy implements SalaryStrategy{

    private final double hourlyRate;
    private final int workedHours;
    private final int nightHours;
    private final double nightShiftBonus;

    public DevOpsSalaryStrategy(double hourlyRate, int workedHours, int nightHours, double nightShiftBonus) {
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.nightHours = nightHours;
        this.nightShiftBonus = nightShiftBonus;
    }

    @Override
    public double calculateSalary() {
        return workedHours * hourlyRate + nightHours * nightShiftBonus;
    }
}
