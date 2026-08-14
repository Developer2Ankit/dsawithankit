package streamAPI.filter.object;

import streamAPI.filter.dto.Employee;

import java.util.List;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employeeObject=new Employee();
        List<Employee> employeeList =employeeObject.getEmployees();
        List<Employee> result=employeeList.stream().filter(n->n.getSalary()>100000).toList();
        System.out.println(result);
        System.out.println("------------------------");
        List<Employee> result2 = employeeList.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .toList();
        System.out.println(result2);
        System.out.println("------------------------");
        List<Employee> result3 = employeeList.stream()
                .filter(e -> e.getDepartment().equals("IT") && e.getSalary()>100000)
                .toList();
        System.out.println(result3);
        System.out.println("------------------------");
        //Find names of employees whose salary > 100000.
        List<String> result4=employeeList.stream().filter(n->n.getSalary()>100000)
                .map(Employee::getName)
                .toList();
        System.out.println(result4);

    }
}
