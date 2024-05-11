
//du kan bare ha en public klasse i filen men så mange ikke public som du vil.
class Person {// klasse er "templaten" eller oppskriften på hvordan du lager objekter, er som
              // dna er klassen og du blir objektet
    // klasser kan ha:
    // 1. Data, din "state" eller hvordan du er nå
    // data i en klasse kalles for instance variables
    String navn;
    int alder;
    // 2. metoder (subrutines)
    void hils(){
        System.out.println("hei jeg heter " + navn);;
    }

}

public class klasser_og_objekter {// når det står public forran class så må klassenavnet matche navnet på java
                                  // filen også
    public static void main(String[] args) {
        // nå kan vi bruke klassen til å lage så mange objekter vi vil
        Person person1 = new Person();
        person1.alder = 19;
        person1.navn = "thomas";

        Person person2 = new Person();
        person2.alder = 51;
        person2.navn = "berent";

        person1.hils();
        person2.hils();
        
    }
}
