package streamAPI.filter.object;

import streamAPI.filter.dto.Employee;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MediumAggregationStreamAPI {
    public static void main(String[] args) {
        Employee employeeObject = new Employee();
        List<Employee> employeeList = employeeObject.getEmployees();

        //21. Calculate the sum of all employee salaries.
        int sumSalar = employeeList.stream()
                .mapToInt(Employee::getSalary).sum();
        System.out.println(sumSalar);

        //22. Calculate the average employee salary.
        OptionalDouble avgSalary= employeeList.stream()
                .mapToDouble(Employee::getSalary).average();
        System.out.println(avgSalary);

        //23. Calculate the total salary of employees from the IT department.
        int sumSalaryITDept = employeeList.stream()
                .filter(employee->employee.getDepartment().equalsIgnoreCase("it"))
                .mapToInt(Employee::getSalary).sum();
        System.out.println(sumSalaryITDept);

        //24. Find the maximum salary.
        int empSalaryMax = employeeList.stream()
                .mapToInt(Employee::getSalary).max().getAsInt();
        System.out.println(empSalaryMax);

        //25. Find the minimum salary.
        int empSalaryMin = employeeList.stream()
                .mapToInt(Employee::getSalary).min().getAsInt();
        System.out.println(empSalaryMin);

        //26. Calculate the average age of employees.
        OptionalDouble avgAgeEmp = employeeList.stream()
                .mapToDouble(Employee::getAge).average();
        System.out.println(avgAgeEmp);

        //27. Count employees in each department.
        Map<String,Long> deptWiseCount=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(deptWiseCount);

        //28. Find the total salary in each department.
        Map<String,Double> deptWiseSalary=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,summingDouble(Employee::getSalary)))
                ;
        System.out.println(deptWiseSalary);

        //29. Find the average salary in each department.
        Map<String,Double> deptWiseSalaryAvgSalary=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,averagingDouble(Employee::getSalary)))
                ;
        System.out.println(deptWiseSalaryAvgSalary);

        //-----------------------------------Level 4: Medium — Grouping-----------------
        //30. Group all employees by department.
        Map<String,List<Employee>> deptWiseEmp=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(deptWiseEmp);

        //31. Get employee names grouped by department.
        Map<String,String> deptWiseEmpName=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.joining(","))));
        System.out.println(deptWiseEmpName);

        //32. Find the highest-paid employee in each department.
        Map<String, Optional<Employee>> deptWiseEmpHighestPaid=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(deptWiseEmpHighestPaid);

        //33. Find the lowest-paid employee in each department.
        Map<String, Optional<Employee>> deptWiseEmpMinPaid=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(deptWiseEmpMinPaid);

        //36. Find all departments having more than 5 employees.
        Map<String, Long> deptWiseEmpMax2=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting())).entrySet().stream().filter(e->e.getValue()>=2)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(deptWiseEmpMax2);

        //37. Find departments where the average salary is greater than 100000.
        Map<String, Double> avgSalaryDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 100000)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println(avgSalaryDept);

        //38. Get names of IT employees whose salary is greater than 100000.
        List<String> resultItEmpSal = employeeList.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .filter(emp -> emp.getSalary() > 100000)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(resultItEmpSal);

        //39. Get the top 5 highest-paid employees from the IT department.
        List<Employee> resultSalDesc = employeeList.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(resultSalDesc);

        //41. Find the second-highest-paid employee from each department.
        Optional<Employee> SecondHighSal= employeeList.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(SecondHighSal);

        //42. Find the top 3 highest-paid employees in each department.
        Map<String, List<Employee>> grouped =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        grouped.entrySet().stream().forEach(entry -> entry.getValue().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2));

        System.out.println(grouped);

        //43. Find duplicate employee names.
        List<String> duplicateNames = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.counting()
                )).entrySet().stream().filter(x->x.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateNames);










    }
}
