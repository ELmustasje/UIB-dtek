package innheritance;

public class maskin {
    public void skruPå() {
        System.out.println("maskin på");
    }

    public void skruAv() {
        System.out.println("maskin av");
    }

    private String name;// har du private forran kan ikke datterklassene bruke dette varablet.  
}
