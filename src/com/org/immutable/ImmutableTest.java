package com.org.immutable;

public class ImmutableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        final Name name = new Name("James", "Bond", "007");
        final Employee employee = new Employee("001", 10000, name);
        System.out.println(employee);
        name.setFirstName("firstNameChanged");
        System.out.println(employee);
    }
}
