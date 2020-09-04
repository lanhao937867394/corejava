package subclass;
import superclass.Person;

public class Student extends Person{
    protected int sid;
    protected int wam;

    public Student(String name, int sid){
        super(name);
        this.sid = sid;
        this.wam = 85;
    }

    // Since name is protected, Student inherits it
    // from the Person class (private fields cannot 
    // be inherited)
    public String getName(){
        return this.name;
    }

    public void printParentName(){
        System.out.println(super.name);
        // System.out.println(super.socialId);
    }
}