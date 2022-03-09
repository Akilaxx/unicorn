package minesweeper;

public class Tile {
    private boolean minetile = false;
    private boolean reveal = false;
    private int mine = 0;

    public boolean hasMinetile() {
        return minetile;
    }

    public void setMinetile(boolean minetile) {
        this.minetile = minetile;
    }

    public boolean isReveal() {
        return reveal;
    }

    public void setReveal(boolean reveal) {
        this.reveal = reveal;
    }

    public int getMines() {
        return mine;
    }

    public void setMines(int mines) {
        this.mine = mines;
    }
}
