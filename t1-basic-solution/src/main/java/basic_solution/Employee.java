package basic_solution;

public abstract class Employee {

    private final String name;

    protected Employee(String name){
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName(){
        return this.name;
    }
}
