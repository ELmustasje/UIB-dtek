public class Hvis{
    public static void main(String[] args) {
        int myInt = 10;
        if(myInt  > 100){
            System.out.println("true");
        }
        else if (myInt < 25){
            System.out.println("false");
        }
        else if (myInt < 23){
            System.out.println("fafa");
        }
        else{
            System.out.println("ffaffa");
        }

        int loop = 0;

        while (true){
            if (loop == 5){
                break;
            }
            System.out.println("loop");
            loop++;
        }
    }
}
