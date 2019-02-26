package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    List<String> employeesNames;

    public EmployeeDto(List<Employee> employees) {
        employeesNames = new ArrayList<>();
        for (Employee employee : employees) {
            employeesNames.add(employee.getFirstname() + " " + employee.getLastname());
        }
    }

    public EmployeeDto() {
        employeesNames = new ArrayList<>();
    }

    public List<String> getEmployeesNames() {
        return this.employeesNames;
    }
}
