public class MoveDown implements Action {
    private final Player player;

    public MoveDown(Player player){
        this.player = player;
    }

    @Override
    public void perform(){
        player.moveDown();
    }
}
