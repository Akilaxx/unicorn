package minesweeper;

public class Mine {
    private boolean exploded = false;
    private boolean hasExploded() {
        return this.exploded;
    }
    private void explode(){
        this.exploded = true;
    }
}
