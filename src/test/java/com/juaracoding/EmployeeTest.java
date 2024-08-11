package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {
    Employee employee;

    @BeforeClass
    public void setUp() {
        employee = new Employee();
        employee.setName("Juara Coding");
        employee.setDepartment("QA");
        employee.setSalary(700000);
    }

    @Test
    public void testGetName() {
        String expected = "Juara Coding";
        String actual = employee.getName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetDepartment() {
        Assert.assertEquals(employee.getDepartment(), "QA");
    }

    @Test
    public void testGetSalary() {
        Assert.assertEquals(employee.getSalary(), 700000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetSalaryNegatif() {
        employee.setSalary(0);
    }

    @Test
    public void testCalculateTax() {
        employee.setSalary(5000000);
        double expected = 250000;
        double actual = employee.calculateTax(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateTaxNegatif() {
        employee.setSalary(700000);
        double expected = 0;
        double actual = employee.calculateTax(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }
}