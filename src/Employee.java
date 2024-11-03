public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {

    }
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }
    public String raiseSalary(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            salary = salary * ((percentage/100)+1);

            return "Raised Salary: " + salary;
        }else return "Wrong percentage value enter between 0 and 100";

    }
    public String toString() {
        return "Employee Info:\nId: " + id + "\nName: " + name + "\nSalary: " + salary + "\nAnnual Salary: " + getAnnualSalary();
    }
}
