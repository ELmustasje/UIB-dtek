class maskin2 {
    public void start() {
        System.out.println("startet");
    }
}
interface plant2{
    public void grow();
}
public class annonymeklasser {
    public static void main(String[] args) {
        maskin2 maskin1 = new maskin2(){//for å lage og overskrive metroder
            @Override public void start(){
                System.out.println("startet igjen");
            }
        };
        maskin2 maskin2 = new maskin2();
        maskin1.start();
        maskin2.start();
        plant2 plant = new plant2(){

            @Override
            public void grow() {
                System.out.println("growing");
            }
            
        };
        plant.grow();
    }
}
