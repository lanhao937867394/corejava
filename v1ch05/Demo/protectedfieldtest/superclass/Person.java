package superclass;

import subclass.*;

public class Person{
    protected String name;
    private int socialId = 0;

    public Person(String name){
        this.name = name;
    }

    protected String getName(){
        return this.name;
    }

    public void accessChildrenName(Student p){

        // parent class can see protected fields of child classes
        // (ONLY if that field is inherited from the parent class)
        // If the protected field is introduced by the subclass,
        // the parent class cannot see it
        // but can't see private fields of child classes (obviously)
        System.out.printf("child name is %s\n", p.name);
        // System.out.printf("child wam is %d\n", p.wam);
    }
}