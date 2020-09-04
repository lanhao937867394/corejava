import java.util.Objects;

public class EqualsTest{

    public static void main(String[] args) {
        Employee e1 = new Employee("Pony Ma", 1);
        Employee e2 = e1;
        Employee e3 = null;
        Employee e4 = new Employee("Pony", 1);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
        System.out.println();
        Manager m1 = new Manager("Pony Ma", 1, "Development");
        Manager m2 = new Manager("Pony Ma", 1, "Development");
        System.out.println(e1.equals(m1));
        System.out.println(m2.equals(m1));
        System.out.println(m1.equals(m2));
        System.out.println();
        Employee e5 = (Employee) m1;
        System.out.println(e5.getClass());
        System.out.println(m1.getClass());
    }
}

class Employee {

    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        
        return Objects.equals(this.name, other.name) && 
        this.employeeId == other.employeeId;
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, int employeeId, String department){
        super(name, employeeId);
        this.department = department;
    }
    
    @Override
    public boolean equals(Object otherObject){

        /*
        Although this calls super.equals, it actually call "Employee.equals"
        as a "Manager" object. Usually what happens is that .equals calls
        equals in Manager class; but super.equals in this case calls equals in
        the Employee class while being a Manager object.
        */
        if(!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;

        return Objects.equals(this.department, other.department);
    }
}