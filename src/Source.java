public class Source{
    public static void main(String[] args) {
        System.out.println("Chess");
    }
}

abstract class Piece{
    int id;
    boolean isAlive;
    public int posX;
    int posY;
}

class King extends Piece{
    King(){
        this.posX = 1;
        this.posY = 1;
        this.isAlive = true;
        this.id = 1;
    }
    public void move(){

    }
}