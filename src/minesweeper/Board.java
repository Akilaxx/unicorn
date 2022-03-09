package minesweeper;

import java.util.Scanner;



public class Board {

    private final int i;
    private int rows;
    private int columns;
    private boolean[][] mines;
    private int flagged;
    private int unknown = rows * columns;
    private int board[][];


    //int[][] board;
    // (int flagged, int unknown) need to be added in line 16???

    public Board(int rows, int columns, boolean[][] mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        this.flagged = flagged;
        this.unknown = rows * columns;

        mines = new boolean[rows][columns];
        board = new int[rows][columns];


        //empty board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mines[i][j] = false;
                board[i][j] = unknown;

            }
        }







    }
}




