public class MoveLeft implements Action {
    private final Player player;

    public MoveLeft(Player player){
        this.player = player;
    }

    @Override
    public void perform(){
        player.moveLeft();
    }
}

