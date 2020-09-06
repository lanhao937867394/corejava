package subclass;
import superclass.Person;

public class Teacher extends Person{
    protected int staffId;

    public Teacher(String name, int staffId){
        super(name);
        this.staffId = staffId;
    }

    public void callStudent(Student s){

        /*
        *** This is important!
        Although protected fields can be inherited by
        subclasses, but a subclass can only access
        such a field of objects of its own class
        (neither the superclass nor other subclasses)
        In this case, teacher object tries to call name in
        student, which is not allowed even though they both
        extends Person
        However, it can call its own name field.
        */
        // System.out.printf("You, %s.\n", s.name);
        System.out.printf("Me, %s.\n", this.name);
    }

    public void callTeacher(Teacher t){

        // staffId can be accessed within the current class
        // since this method callTeacher is in the current class,
        // we can access staffId
        System.out.printf("This teacher, %s\n", t.staffId);
    }

    protected int getStaffId(){
        return this.staffId;
    }
}