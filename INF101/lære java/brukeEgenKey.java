import java.util.HashMap;
import java.util.Map;

class Person10 {
    private int ID;
    private String name;

    public Person10(int id, String name) {
        this.ID = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + ID + " name: " + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
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
        Person10 other = (Person10) obj;
        if (ID != other.ID)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}

public class brukeEgenKey {
    public static void main(String[] args) {

        Person10 p1 = new Person10(1, "thomas");
        Person10 p2 = new Person10(2, "markus");
        Person10 p3 = new Person10(3, "vera");
        Person10 p4 = new Person10(1, "thomas");

        Map<Person10, Integer> map1 = new HashMap<Person10, Integer>();
        map1.put(p1, 1);
        map1.put(p2, 2);
        map1.put(p3, 3);
        map1.put(p4, 4);

        for(Person10 key:map1.keySet()){
            System.out.println(key + " : " + map1.get(key));
        }
    }
}


