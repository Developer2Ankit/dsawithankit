package streamAPI.filter.object;

import streamAPI.filter.dto.Employee;

import java.util.List;
import java.util.Optional;

public class EasyStreamAPI {
    public static void main(String[] args) {
        Employee employeeObject = new Employee();
        List<Employee> employeeList = employeeObject.getEmployees();

        //1. Get all employee names.
        List<String> empName = employeeList.stream().map(Employee::getName).toList();
        System.out.println(empName);

        //2. Get all employees whose salary is greater than 100000.
        List<Employee> empList = employeeList.stream().filter(e -> e.getSalary() > 100000).toList();
        System.out.println(empList);

        //3. Get names of employees whose salary is greater than 100000.
        List<String> empNameBasedOnSalary = employeeList.stream().filter(e -> e.getSalary() > 100000).
                map(Employee::getName).toList();
        System.out.println(empNameBasedOnSalary);

        //4. Count employees whose age is greater than 30.
        Long countBasedOnAge = employeeList.stream().filter(e -> e.getAge() > 30).
                count();
        System.out.println(countBasedOnAge);

        //5. Get all unique departments.
        List<String> uniqueDept = employeeList.stream()
                .map(Employee::getDepartment).distinct().toList();
        System.out.println(uniqueDept);

        //6. Get the first employee from the list.
        Optional<Employee> firstEmployee = employeeList.stream()
                .findFirst();
        System.out.println(firstEmployee);

        //7. Check whether any employee has a salary greater than 200000.
        Boolean anyMatch = employeeList.stream().anyMatch(e -> e.getSalary() > 100000);
        System.out.println(anyMatch);

        //8. Check whether all employees are older than 18.
        Boolean allMatch = employeeList.stream().allMatch(e -> e.getAge() > 30);
        System.out.println(allMatch);

        //9. Check whether no employee has a negative salary.
        Boolean negativeSal = employeeList.stream().noneMatch(e -> e.getSalary() < 0);
        System.out.println(negativeSal);

        //10. Get the first 5 employees.
        List<Employee> firstFiveEmpList = employeeList.stream().limit(5).toList();
        System.out.println(firstFiveEmpList);

        //11. Skip the first 5 employees and get the remaining employees.
        List<Employee> skitFirstFiveEmpList = employeeList.stream().skip(5).toList();
        System.out.println(skitFirstFiveEmpList);


    }
}
