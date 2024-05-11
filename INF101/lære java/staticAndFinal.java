class thing {
    public final static int nummer = 10;// final er java sin konstant, så denne kan aldri endres etter den er blit
                                        // laget.

    public String name;// når det ikke står static forran så kommer variablet til å høre til et hvert
                       // objekt

    public static String beskrivelse;// når det står static betyr det at det er et klassevarabel og alle i klassen
                                     // har samme;

    public static void showInfo() {
        System.out.println("jeg er en ting");// her kan du ikke skrive sysout(name), siden du kan ikke gi en statisk
                                             // referanske til et ikkestatisk variabel
    }

    private static int count = 0;
    private int id;

    int get_id(){
        return id;
    }

    public thing() {// skjer hver gang du lager en ny thing
        id = count;
        count++;
    }
    static int get_count(){
        return count;
    }
  

}

public class staticAndFinal {
    public static void main(String[] args) {
        thing thing1 = new thing();// public thing() blir utført nå
        thing thing2 = new thing();
        
        thing1.name = "bob";
        thing2.name = "ali";
        thing.beskrivelse = "hei";// riktig syntax er bare thing.beskrivelse men når du endrer på en av de endrer
                                   // du på alle objektene
        System.out.println(thing1.name + thing2.name);
        System.out.println(thing2.beskrivelse + thing1.beskrivelse);
        thing.showInfo();
        System.out.println(thing.nummer); // thing.nummer = 1; hadde ikke virket
        System.out.println(thing.get_count());
        System.out.println(thing2.get_id());
        

    }

}
