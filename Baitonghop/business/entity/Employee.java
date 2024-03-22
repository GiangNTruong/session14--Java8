package Baitonghop.business.entity;

import Baitonghop.config.InputMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
    private String employeeId ;
    private String 	employeeName;
    private LocalDate birthday;
    private boolean sex ;
    private double salary;
    private Employee manager ;
    private Derpartment derpartment;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Derpartment derpartment) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.derpartment = derpartment;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Derpartment getDerpartment() {
        return derpartment;
    }

    public void setDerpartment(Derpartment derpartment) {
        this.derpartment = derpartment;
    }
    public void inputData(){


    }

    public void display(){
        System.out.println("Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", manager=" + manager +
                ", derpartment=" + derpartment +
                '}');
    }

}
