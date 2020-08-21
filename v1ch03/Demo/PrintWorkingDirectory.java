public class PrintWorkingDirectory {

    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        System.out.printf("%s\n", dir);
    }
}