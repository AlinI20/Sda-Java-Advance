package com.sda.javafundaments.Xand0;

import java.util.Scanner;

public class Position {
    public int row;
    public int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    private void isPositionOccupied(Scanner sc, String[][] board) {
        while (!board[this.row][this.column].equals("_")) {
            System.out.println("Enter different indexes");
            this.row = sc.nextInt();
            this.column = sc.nextInt();
        }
    }

    private void isIndexInRange(Scanner sc, String[][] board) {
        while (this.row > board.length || this.column > board.length) {
            System.out.println("Enter index in range: " + (board.length - 1));
            this.row = sc.nextInt();
            this.column = sc.nextInt();
        }
    }
    public void isPositionValid(Scanner sc, String[][] board){
        isIndexInRange(sc, board);
        isIndexInRange(sc, board);
    }
}

