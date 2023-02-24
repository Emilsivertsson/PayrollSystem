public abstract class Employee implements Payable{ // Superclass for all employee-groups

    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;
    private Address address;

    protected Department department;
    private static int nextID = 1000;
    public static double STARTING_PAY_RATE = 7.75;

    //constructor
    public Employee (String name){
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    //overloaded constructor
    public Employee (String name, double pay){
        this.name = name;
        this.payRate = pay;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public String getName() {
        return name;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }
    public Department getDepartment(){
        return department;
    }

    public void changeName(String newName)
    { name = newName; }

    public void changePayRate (double newRate){
        payRate = newRate;
    }

    public void setAddress(Address addr) {
        address = addr;
    }

    public void displayAdress(){
        address.getAdress();
    }
    public static int getNextID(){
        int id = nextID;
        nextID++;
        return id;
    }

    @Override
    public String toString() {
        return this.name +
                " - " +
                this.getDepartment();
    }
}
