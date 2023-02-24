
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //create departments
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        //create employees
        SalariedEmployee emp1 = new SalariedEmployee("Bob Hope",65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Jane", 35000,dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Billy Joe", 40000,dept3);

        // Print to employees to file
        //String filename = "Paystubs.txt";

        //List<SalariedEmployee> employees = new ArrayList<>();
        //employees.add(emp1);
        //employees.add(emp2);
        //employees.add(emp3);

        //SalariedEmployee.printStub(filename, employees);




        //List of employees
        Employee[] employees = {emp1, emp2, emp3};

        List<Employee> employeeList = Arrays.asList(employees);

        //loops and print employees
        for (int i = 0; i < employeeList.size(); i++){
            System.out.println(employees[i]);
        }


        //to print by Department, not working
        /*
        System.out.println("Employees grouped by Department: ");
        Map<String, List<Employee>> groupedByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                department, employeesIndepartment) ->
        {
            System.out.println(department);
            employeesIndepartment.forEach(
                    employee -> System.out.printf("%s%n", employee);
            )
        }

         */


    }
}