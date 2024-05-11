import java.util.Scanner;

class maskin {

    private String navn;
    private int alder;

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public int getAge(){
        return alder;
    }

    public maskin() {// Constructoren skjer når du lager et nytt objekt uansett og må ha samme navn
                     // som classen
        System.out.print("maskin på, skriv et navn: ");
        Scanner Navn = new Scanner(System.in);
        setNavn(Navn.nextLine());
        System.out.println(this.navn);

    }
    public maskin(int alder){
        this.alder = alder;
    }
}

public class constructors {
    public static void main(String[] args) {
        maskin maskin1 = new maskin(1);//java leter om du har laget en constructor som oppfyller det du har gitt
        maskin maskin2 = new maskin();
        

        System.out.println(maskin1.getAge());
    }
}
