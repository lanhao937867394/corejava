import subclass.*;
import superclass.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Adam",1);
        Teacher t1 = new Teacher("Sam", 2);
        Teacher t4 = new Teacher("John", 5);
        Tutor t2 = new Tutor("Tyson", 3);
        Tutor t3 = new Tutor("Alan", 4);

        Person p = new Person("Bob");
        
        // Testing protected fields
        /*
        This is not allowed. Since "name" in the Person
        class is protected, can only be accessed by:
        1. any classes in the same package
        2. subclasses in any packages
        The current class is the "Main" class, which is neither
        a subclass of Person nor a class in the Person's package
        */
        // System.out.println(s1.name);

        // This is allowed. name is protected so 
        // Student inherits it from Person.
        System.out.println(s1.getName());
        t1.callStudent(s1);
        t1.callTeacher(t4);
        t2.selfIntroduce();
        t2.introduceCollegue(t3);
        // t2.introduceSupervisor(t1);
        t2.accessCollegueYearGroup(t3);
        p.accessChildrenName(s1);
        s1.printParentName();
        System.out.println(p.getClass() == s1.getClass());

        // Testing protected methods
        /*
        Subclasses can access protected fields and methods of the parent class
        and vice versa.
        */
        System.out.println(t2.getStaffIdPublic(t1));
    }
}