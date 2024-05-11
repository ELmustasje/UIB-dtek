package math;

public class Math {
   
    public int round(double tall) {
        boolean negativt = false;
        int helTall = 0;
        if (tall < 0) {
            tall = tall * -1;
            negativt = true;
        }
        if (tall % 1 == 0) {
            helTall = (int) tall;
        } else {
            double desimal = tall % (int) tall;
            System.out.println(desimal);
            if (desimal < 0.5) {
                helTall = (int) tall;
            } else if (desimal >= 0.5) {
                helTall = (int) (tall + 1 - desimal);
            }
        }
        if (negativt == true) {
            helTall = helTall * -1;
        }
        return helTall;
    }
    public double tan(){
        double tanges = 0;
        
        return tanges;
    }
}
