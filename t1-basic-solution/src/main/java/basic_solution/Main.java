package basic_solution;

public class Main {

    public static void main(String[] args) {

        Employee developer = new Developer("Alice", 4000);

        Employee devOps = new DevOpsEngineer(
                "Bob",
                25,
                160,
                20,
                10
        );

        Employee teamLead = new TeamLead(
                "Charlie",
                30,
                160,
                500,
                1.15
        );

        Employee ceo = new CEO(
                "David",
                8000,
                100000,
                0.02
        );

        System.out.println(developer.getName() + ": " + developer.calculateSalary());
        System.out.println(devOps.getName() + ": " + devOps.calculateSalary());
        System.out.println(teamLead.getName() + ": " + teamLead.calculateSalary());
        System.out.println(ceo.getName() + ": " + ceo.calculateSalary());
    }


}
