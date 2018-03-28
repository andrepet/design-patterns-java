public class Player {
    private int x,y;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
