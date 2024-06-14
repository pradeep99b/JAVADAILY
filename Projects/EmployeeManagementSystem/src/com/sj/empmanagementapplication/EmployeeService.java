package com.sj.empmanagementapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<>();

    Employee emp1 = new Employee(101, "Sheetal", 24, "Developer", "IT", 25000);
    Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 55000);
    Employee emp3 = new Employee(103, "Bob", 20, "DevOps Engineer", "Admin", 50000);
    Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    public void viewAllEmps() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    public void viewEmp() {
        System.out.println("Enter id: ");
        id = sc.nextInt();

        found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }

    public void updateEmployee() {
        System.out.println("Enter id: ");
        id = sc.nextInt();

        boolean found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name = sc.next();
                System.out.println("Enter new Salary: ");
                sal = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details updated successfully!!");
        }
    }

    public void deleteEmp() {
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }
    }

    public void addEmp() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter department: ");
        department = sc.next();
        System.out.println("Enter designation: ");
        designation = sc.next();
        System.out.println("Enter Salary: ");
        sal = sc.nextDouble();

        Employee emp = new Employee(id, name, age, designation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }
}
