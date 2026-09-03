package streamAPI.filter.dto;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private int age;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Employee(String name, String department, int salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;

    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ankit", "IT", 120000, 32));
        employees.add(new Employee("Rahul", "HR", 80000, 30));
        employees.add(new Employee("Amit", "IT", 150000, 35));
        employees.add(new Employee("Pankaj", "Finance", 130000, 29));
        employees.add(new Employee("Saurabh", "Finance", 150000, 31));
        employees.add(new Employee("Rohit", "IT", 90000, 27));
        employees.add(new Employee("Keshav", "CSE", 210000, 27));
        employees.add(new Employee("Narayan", "CSE", 310000, 31));
        employees.add(new Employee("Madhav", "IT", 500000, 27));
        employees.add(new Employee("Madhav", "CSE", 550000, 34));


        return employees;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
