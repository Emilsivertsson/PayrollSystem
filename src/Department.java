import java.util.ArrayList;

public class Department {

    private final String name;
    private ArrayList <Employee> employees;

    public Department (String n)
    {this.name = n;}

    public String getName(){
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
