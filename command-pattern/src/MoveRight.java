public class MoveRight implements Action {
    private final Player player;

    public MoveRight(Player player){
        this.player = player;
    }

    @Override
    public void perform(){
        player.moveRight();
    }
}

