package streamAPI.filter.object;

import streamAPI.filter.dto.Employee;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EasytoMediumStream {
    public static void main(String[] args) {

        Employee employeeObject = new Employee();
        List<Employee> employeeList = employeeObject.getEmployees();

        //12. Sort employees by salary in ascending order.
        List<Employee> ascEmpList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(ascEmpList);

        //13. Sort employees by salary in descending order.
        List<Employee> dscEmpList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(dscEmpList);

        //Sort employees by name alphabetically.
        List<Employee> ascEmpListByName = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println(ascEmpListByName);

        //15. Find the employee with the highest salary.
        Optional<Employee> highestSalaryEmp = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(highestSalaryEmp);

        //16. Find the employee with the lowest salary.
        Optional<Employee> lowestSalaryEmp = employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary));
        System.out.println(lowestSalaryEmp);

        //17. Find the second-highest salary.
        Optional<Integer> ndHighestSalary = employeeList.stream()
                .map(Employee::getSalary).distinct()
            .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(ndHighestSalary);

        //18. Find the third-highest salary.
        Optional<Integer> thirdHighestSalary = employeeList.stream()
                .map(Employee::getSalary).distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
        System.out.println(thirdHighestSalary);

        //19. Find the employee with the second-highest salary.
        Optional<Employee> empHighestSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(empHighestSalary);

        //20. Get the top 3 highest-paid employees.
        List<Employee> top3HighestSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3).toList();
        System.out.println(top3HighestSalary);







    }
}
