class robot{//parametre kan endre hvordan klassen oppfører seg og du skriver den inni parantesen.
    public void snakk(String ord){
        System.out.println(ord);
    }
    public void hopp(int lengde){
        System.out.println("hoppet: " + lengde +" meter");
    }
    public void bevege(String retning, int lengde){
        System.out.println("bevegde seg " + lengde + " i retning " + retning);
    }
}



public class metode_parametre {
    public static void main(String[] args) {
        robot pappa = new robot();
        pappa.snakk("jeg heter berent");
        pappa.bevege("sør", 2);
    }
}
