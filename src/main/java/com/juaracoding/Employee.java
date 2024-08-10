package com.juaracoding;

public class Employee {

    private String name;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary harus lebih dari 0");
        }
    }

    //calculateTax
    public double calculateTax(double salary){
        if (salary >= 5000000){
            return salary * 0.05;
        } else {
            return salary * 0;
        }
    }

}
