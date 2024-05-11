package polymorphism;


public class polymorphism {
    public static void main(String[] args) {
        plant plant1 = new plant();
        tre tre1 = new tre();
        plant plant2 = tre1;//kan bruke datterklassen og da blir datterklassens matode brukt hvis samme metode er i hovedklassen
        plant2.grow();//kommer til å bruke tre sin grow()
        plant1.grow();

    }
}
