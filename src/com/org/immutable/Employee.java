package com.org.immutable;

public class Employee {
    private final String id;
    private final int salary;
    private final Name name;

    public Employee(String id, int salary, Name name) throws CloneNotSupportedException {
        this.id = id;
        this.salary = salary;
        this.name = (Name) name.clone();
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", name=" + name +
                '}';
    }
}
