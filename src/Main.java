import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee emp1 = new SalariedEmployee("Bob Hope",65000 );
        SalariedEmployee emp2 = new SalariedEmployee("Jane", 35000);
        SalariedEmployee emp3 = new SalariedEmployee("Billy Joe", 40000);


        String filename = "Paystubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        SalariedEmployee.printStub(filename, employees);
    }
}