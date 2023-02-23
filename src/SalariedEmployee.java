import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

public class SalariedEmployee extends Employee{


    private double salary;
    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double sal) {
        super(name);
        this.salary = sal;

    }

    @Override
    public double calculatePay() {
        return this.salary-(this.salary * .3);
    }

    @Override
    public String generatePayStub() {
        Address address = new Address("5 Emerald Close", "Kingston", "Kingston", "00000");
        Company company = new Company("Abc Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        String strDate = format.format(date);

        String outString;
        outString = "\t\t\t" + company.getName() +
        "\n\t" + "Name: " + getName() + " - Employee" + getEMPLOYEE_ID() +
        "\n\t" + "Paydate \t" + strDate +
        "\n\t" + "Net Salary $" + salary +
        "\n\t" + "Gross Salary $" + calculatePay() + "\n\n";

        return outString;
    }
    public static void printStub(String filepath, List<SalariedEmployee> employees){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true))){
            for (SalariedEmployee employee : employees) {
                writer.write(employee.generatePayStub());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while printing the paystub");
            throw new RuntimeException(e);
        }
    }
}
