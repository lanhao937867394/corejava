import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int userInput = -1;
        if (sc.hasNextInt()){
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.printf("You entered %d.\n", userInput);
                    break;
                
                case 0:
                    System.out.printf("You entered zero.\n");
                    break;

                case -1:
                    System.out.printf("You entered -1.\n");
                    break;
                default:
                    System.out.println("Not -1, 0, or 1.");
                    break;
            }
        } else{
            System.out.println("Illegal input.");
        }
        sc.close();
    }
}