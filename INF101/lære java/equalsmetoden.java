class person4{
    private int id;
    private String name;

    public person4(int id, String name){
        this.id = id;
        this.name = name;

    }
    public String toString(){
        return "Person [id=" + id + ", name = " + name;
        }
    @Override
    public int hashCode() {//unik id til hvert objekt, ta sysout på et objekt som du ikke har sutte toString() så får du hashcode
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        person4 other = (person4) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}

public class equalsmetoden {
    public static void main(String[] args) {
        System.out.println(new Object());//hascode etter @
        person4 person1 = new person4(1,"bob");
        person4 person2 = new person4(1,"bob");

        System.out.println(person1==person2);//sjekker om de peker på//er samme objekt. false
        System.out.println(person1.equals(person2));//sjekker om innholdet er det samme utifra hva du bestemte skulle sammenlignes over. true

        //.equals: string,class,objekt,float,doubble, når du vil se om verdien er det samme
        //==: ints, når du vil se om de peker på samme objekt.
    }

}
