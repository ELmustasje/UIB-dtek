package lagreting;

import java.io.Serializable;

public class person implements Serializable {
    private int age;
    private String name;

    public person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Navn: " + name + ", Alder: " + age;
    }
}
