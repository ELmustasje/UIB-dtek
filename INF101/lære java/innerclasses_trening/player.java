package innerclasses_trening;

public class player {
    private int id;

    public void setId(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }
    class legs{
        String dir;

        public void move(String dir){
            if (dir.equals("left")){
                System.out.println("moving left");
            }
        }

    }
}
