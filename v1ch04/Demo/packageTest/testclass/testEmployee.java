package testclass;

// Still got to import the class from that package!
import com.google.*;
public class testEmployee {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Hao", 1, 500_000);
        System.out.printf("%s has an id %d, and a salary of AU$%f.\n", e1.getName()
        ,e1.getId(), e1.getSalary());
    }
}