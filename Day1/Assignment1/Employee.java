class Employee {
    int id;
    String name;
    String department;
    double salary;
    boolean activeStatus;

    public Employee(int id, String name, String department, double salary, boolean activeStatus) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.activeStatus = activeStatus;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary + " " + activeStatus;
    }
}
