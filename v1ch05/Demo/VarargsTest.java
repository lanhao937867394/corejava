public class VarargsTest {
    
    public static void main(String... args) {
        for(String s : args){
            System.out.println(s);
        }

        VarargsTest.findMax(1,Integer.valueOf(2),3);
    }

    public static void findMax(double... args){
        for(double n: args){
            System.out.println(n + 1);
        }
    }
}
