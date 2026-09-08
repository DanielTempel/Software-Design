package basic_solution;

public class DevOpsEngineer extends Employee{

    private final double hourlyRate;
    private final int workedHours;
    private final int nightHours;
    private final double nightShiftBonus;

    public DevOpsEngineer(
            String name,
            double hourlyRate,
            int workedHours,
            int nightHours,
            double nightShiftBonus
    ) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.nightHours = nightHours;
        this.nightShiftBonus = nightShiftBonus;
    }

    @Override
    public double calculateSalary() {
        return workedHours * hourlyRate
                + nightHours * nightShiftBonus;
    }
}
