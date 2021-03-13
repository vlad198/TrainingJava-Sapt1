package employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

public @Getter
@AllArgsConstructor
class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + getName() +
                ", salary=" + salary +
                ']';
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary = (int) (salary + ((double) (salary) * (double) ((double) (percent) / (double) (100))));
        return salary;
    }
}
