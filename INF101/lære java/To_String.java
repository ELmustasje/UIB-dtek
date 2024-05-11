class mus{
    public String toString(){//toString er en innebygd metode som kommer ut hvis du kaller på objektet som en string
        return "hei";
    }
}
class hest{

}

public class To_String {
    public static void main(String[] args) {
        mus mus1 = new mus();
        hest hest1 = new hest();
        System.out.println(mus1);
        System.out.println(hest1);//uten toString får du klassenavnet@hashkoden til objektet
    }
}
