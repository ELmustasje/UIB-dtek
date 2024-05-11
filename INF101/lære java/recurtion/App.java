package recurtion;

public class App {
    public static void main(String[] args) {
        int value = 25;

        System.out.println(factorial(value));
    }

    public static long factorial(int value) {
        System.out.println(value);
        if (value == 1){
            return 1;
        }
        return factorial(value-1)*value;
    }
}
 