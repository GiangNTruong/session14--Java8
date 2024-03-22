package Baitonghop.business.design;
import Baitonghop.business.entity.Derpartment;
import Baitonghop.business.entity.Employee;

import java.util.List;
public interface IGenericDesign {
    void displayAllDepartments();
    // Department management
    List<Derpartment> getDepartments();
    void addDepartment(Derpartment department);
    void editDepartmentName(String departmentId, String newName);
    List<Employee> getEmployeesByDepartment(String departmentId);
    void removeDepartment(String departmentId);

    // Employee management
    void displayAllEmployees();
    List<Employee> getAllEmployees();
    Employee getEmployeeDetails(String employeeId);
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    void removeEmployee(String employeeId);

    // Statistics
    double averageNumberOfEmployeesPerDepartment();
    List<Derpartment> top5DepartmentsByNumberOfEmployees();
    Employee managerWithMostEmployees();
    List<Employee> top5OldestEmployees();
    List<Employee> top5HighestPaidEmployees();
    void displayDepartments();
    void displayEmployees();
}
