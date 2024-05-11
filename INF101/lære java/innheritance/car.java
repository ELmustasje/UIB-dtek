package innheritance;

public class car extends maskin{//når du bruker extends blir dette en datterklasse som får alle metodene til klassen over men du kan lage særegne metoder til kun denne
    public void vinduvisker(){
        System.out.println("vakser vindu");
    }
    public void skruPå(){
        System.out.println("bil på");//overstyrer den oginale metoden i klassen over.
    }
    
    
}
