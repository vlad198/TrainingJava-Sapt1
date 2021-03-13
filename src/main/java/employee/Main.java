package employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "John", "Doe", 1000);
        System.out.println(e);

        System.out.println("Name : " + e.getName());
        System.out.println("Salary : " + e.getSalary());
        System.out.println("Salary increased : " + e.raiseSalary(45));
        System.out.println("Salary : " + e.getSalary());
        System.out.println("Annual salary : " + e.getAnnualSalary());
    }
}
