package enum11;

public enum Animal {
    CAT("tom",6),DOG("fido",3),MOUSE("jerry",10);

    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
