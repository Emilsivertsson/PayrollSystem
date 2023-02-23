public class HourlyEmployee extends Employee{

    private int hoursworked;
    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, int hours) {
        super(name);
        this.hoursworked = hours;
    }

    @Override
    public double calculatePay() {
        return this.hoursworked * getPayRate();
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}
