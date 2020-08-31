public class PrivateFieldSameClass {

    /*
    methods of an object can access private fields of other objects
    if they are from the same class
    */
    
    private String name;

    public PrivateFieldSameClass(String name){
        this.name = name;
    }

    public void accessOtherName(PrivateFieldSameClass p){
        System.out.println(p.name);
    }
    public static void main(String[] args) {
        PrivateFieldSameClass p1 = new PrivateFieldSameClass("A");
        PrivateFieldSameClass p2 = new PrivateFieldSameClass("B");
        p1.accessOtherName(p2);
        p2.accessOtherName(p1);
    }
}