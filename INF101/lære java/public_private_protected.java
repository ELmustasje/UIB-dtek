class plant {
    public String name = "fredd";// hvilke som helst klasse kan endre på denne
    private String beskrivelse = "en gønn plante";
    protected int alder;//når det er protected kan den bli endet og hentet av en datterklasse og samme packadge men ikke noe annet
    public void ny_beskrivelse() {
        beskrivelse = "en blå plante";
    }

    public String gi_beskrivelse() {
        return beskrivelse;
    }
    
}
class tre extends plant{
    public tre(){
        this.alder = 10;
    }
    
}
public class public_private_protected {
    public static void main(String[] args) {
        plant plant = new plant();
        plant.name = "thomas";
        // plant.beskrivelse = "en blå plante" får feilmelidng
        // må bruke en method for å endre eller nå varablet som er sikrere siden du kan
        // kontrolere hva som kan gjøres med den
        plant.ny_beskrivelse();
        System.out.println(plant.gi_beskrivelse());
        tre tre = new tre();
        plant.alder = 10;
        System.out.println(tre.alder);
    }
}
/*
 *public -- hvor som helst
 * private -- samme klasse 
 * protected -- datterklasse og samme packagde
 * ingen modifier --  samme packagde
 */
