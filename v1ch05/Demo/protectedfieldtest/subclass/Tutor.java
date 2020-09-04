package subclass;

public class Tutor extends Teacher{

    private String yearGroup = "Thrid year";

    public Tutor(String name, int staffId){
        super(name, staffId);
    }

    public void selfIntroduce(){

        // protected fields can be inherited many times
        // down the inheritance hierarchy
        System.out.printf("My name is tutor %s\n", this.name);
        System.out.printf("My staff is %d\n", this.staffId);
    }

    // You can't access protected fields of other classes
    // public void introduceSupervisor(Teacher t){
    //     System.out.printf("This is my supervisor, %s\n", t.name);
    // }

    public void introduceCollegue(Tutor t){

        // can access protected fields of objects 
        // from the same class
        System.out.printf("This is my collegue %s\n", t.name);
    }

    public void accessCollegueYearGroup(Tutor otherTutor){

        // can even access private fields of objects 
        // from the same class
        System.out.printf("My collegue is in the %s\n", otherTutor.yearGroup);
    }
}