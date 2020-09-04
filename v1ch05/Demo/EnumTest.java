import java.util.Scanner;

public class EnumTest {
 
    private enum Size{

        SMALL(0), MEDIUM(1), LARGE(2);
        
        private Size(int number){
            this.number = number;
        }

        public int getNumber(){
            return this.number;
        }
        private int number;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size (SMALL, MEDIUM, LARGE): ");

        // For some reason, valueOf seems to also be an instance method.
        // Use the static valueOf.
        Size size = Enum.valueOf(Size.class, sc.nextLine());
        System.out.println("You have entered " + size);

        System.out.println("All available size: ");
        for (Size s : Size.values()){
            System.out.print(s.getNumber());
            System.out.println(s);
        }
        sc.close();
    }
}
