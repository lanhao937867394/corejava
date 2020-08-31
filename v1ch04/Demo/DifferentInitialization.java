public class DifferentInitialization {

    private static int id = setInitialID();
    private static String companyName;

    /*
    Static fields can be intialized be an initial value,
    a static method, or a static initialization block
    */
    static {
        companyName = "EdLaN.com";
    }

    /*
    This field assignment is carried out before the constructor executes.
    This is useful when all instances of this class will first be initialized
    to a default value (which can be changed later)
    */
    private String name = "Default employee";

    /*
    Fields can be initialized using a method.
    The reason why setId is static is that:
    it does not need to access the instance state and
    it accesses only static field of the class.
    */
    private int employeeId = DifferentInitialization.setId();

    public DifferentInitialization(){

        // You can check that the field "name" and "id" are indeed 
        // initialized before the constructor executes
        System.out.println(this.name);
        System.out.println(this.employeeId);
    }

    private static int setInitialID(){
        return 1;
    }

    private static int setId(){
        int newId = DifferentInitialization.id;
        DifferentInitialization.id++;
        return newId;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.employeeId;
    }

    public static void main(String[] args) {
        DifferentInitialization e1 = new DifferentInitialization();
        DifferentInitialization e2 = new DifferentInitialization();
        System.out.printf("%s: %d, %s: %d\n", e1.getName(), e1.getId(), 
        e2.getName(), e2.getId());
        System.out.printf("They both work at %s.\n", DifferentInitialization.companyName);
    }
}