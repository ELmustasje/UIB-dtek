package enum11;

public class App{
    public static void main(String[] args) {
        Animal animal1 = Animal.MOUSE;
        Animal animal2 = Animal.CAT;
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());
        System.out.println(animal2.getName());
        System.out.println(animal2.getAge());
    }
}