public class ExtendsAbstractClass {
    
    public static void main(String[] args) {
        Person p1 = new Student("Adam", 11111111);
        p1.getDescription();
    }
}

abstract class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void getDescription();
}

class Student extends Person{
    private int sid;

    public Student(String name, int sid){
        super(name);
        this.sid = sid;
    }

    // non-abstract subclass must implement abstract method in the abstract superclass
    public void getDescription(){

        // You cannot access private fields of the super class; however, you can 
        // call accessor to access such a field
        System.out.printf("Student: %s, sid: %d\n", this.getName(), this.sid);
    }

}