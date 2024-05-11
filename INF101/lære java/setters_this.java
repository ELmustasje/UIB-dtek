class frog{
    private String navn;//gjør det sikkrene da du ikke tar informasjon gjennom klasser
    private int alder;

    public String getName(){
        return navn;
    }
    public int getAge(){
        return alder;
    }
    public void setName(String navn){
        this.navn = navn;//this.navn er variablet til klassen mens navn blir det lokale variablet som brukes innad i {}
    }
    public void setAge(int alder){
        this.alder = alder;
    }

}  

public class setters_this {
    public static void main(String[] args) {
        frog nyfrog = new frog();
        nyfrog.setAge(1);
        nyfrog.setName("per");
        System.out.println(nyfrog.getAge());
        
    }
}
