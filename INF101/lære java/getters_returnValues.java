class person {
    int alder;
    String navn;

    int årIgjenTilPensjon() {//i stedetfor å bruke en metode som ikke gir en return er dette mer som en fuksjon def i python.
        int år = 70 - alder;
        return år;
    }
    Boolean sjekkOmKultNavn(){
        if (navn == "thomas"){
            return true;
        }
        else{
            return false;
        }
        
    }
}

public class getters_returnValues {
    public static void main(String[] args) {
        person person1 = new person();
        person1.alder = 20;
        person1.navn = "thodmas";
        int årIgjen = person1.årIgjenTilPensjon();
        System.out.println(årIgjen);
        if (person1.sjekkOmKultNavn()){
            System.out.println("kult navn");
        }
        else{
            System.out.println("teit navn");
        }
    
    }
}
