package com.Task2;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id,String firstName,String lastName,int salary)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String gettName()
    {
        return (firstName+" "+lastName);
    }

    public int getAnnualSalary()
    {
        return (salary*12);
    }

    public int raiseSalary(int percent)
    {
        return salary*=percent;
    }

    @Override
    public String toString() {
        return ("id = " + id + " name = " + firstName + " " + lastName + " salary = " + salary);
    }
}


