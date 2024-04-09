import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private String fullName;
    private int departament;
    private double salary;
    public static final AtomicInteger ID = new AtomicInteger(1);
    private final int id;

    public Employee(String fullName, int departament, double salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = ID.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + "Ф.И.О - " + fullName + ", отдел - " + departament + ", зароботная плата - " + salary + ", id=" + id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Employee employee = (Employee) object;
        return getDepartament() == employee.getDepartament() && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getDepartament());
    }
}
