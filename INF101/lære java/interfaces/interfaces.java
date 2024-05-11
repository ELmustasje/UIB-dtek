package interfaces;

class person implements info{
    String name;

    public person(String name){
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("info");
    }

}


public class interfaces {
    public static void main(String[] args) {
        person per1 = new person("bob");
        System.out.println(per1.name);


    }
}


