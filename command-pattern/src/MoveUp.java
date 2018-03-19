public class MoveUp implements Action {
    private final Player player;

    public MoveUp(Player player){
        this.player = player;
    }

    @Override
    public void perform(){
        player.moveUp();
    }
}
