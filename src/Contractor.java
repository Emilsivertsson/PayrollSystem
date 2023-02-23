public class Contractor extends Employee implements Payable {

    private int hoursWorked;
    private double partsCost;

    public Contractor(String name) {
        super(name);
    }

    public Contractor(String name, int hours, double parts) {
        super(name);
        this.hoursWorked = hours;
        this.partsCost = parts;
    }


    @Override
    public double calculatePay() {
        return (hoursWorked * getPayRate()) + partsCost;
    }

    @Override
    public String generatePayStub() { //invoice for contractor
        return null;
    }
}
