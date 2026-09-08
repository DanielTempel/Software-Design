package strategy_pattern_solution;

public class Main {

    public static void main(String[] args) {

        Employee developer = new Employee(
                "Alice",
                "Developer",
                new FixedSalaryStrategy(4000)
        );

        Employee devOps = new Employee(
                "Bob",
                "DevOps Engineer",
                new DevOpsSalaryStrategy(
                        25,
                        160,
                        20,
                        10
                )
        );

        Employee teamLead = new Employee(
                "Charlie",
                "Team Lead",
                new TeamLeadSalaryStrategy(
                        30,
                        160,
                        500,
                        1.15
                )
        );

        Employee ceo = new Employee(
                "David",
                "CEO",
                new CeoSalaryStrategy(
                        8000,
                        100000,
                        0.02
                )
        );

        System.out.println(developer.getName() + ": " + developer.calculateSalary());
        System.out.println(devOps.getName() + ": " + devOps.calculateSalary());
        System.out.println(teamLead.getName() + ": " + teamLead.calculateSalary());
        System.out.println(ceo.getName() + ": " + ceo.calculateSalary());
    }
}

