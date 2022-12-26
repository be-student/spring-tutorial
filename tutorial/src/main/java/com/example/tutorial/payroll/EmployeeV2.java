package com.example.tutorial.payroll;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EmployeeV2 {

    private @Id
    @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    EmployeeV2() {
    }

    EmployeeV2(String firstName, String lastName, String role) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeeV2)) {
            return false;
        }
        EmployeeV2 employee = (EmployeeV2) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
                + '\'' + ", role='" + role + '\'' + '}';
    }
}
