package com.sda.javafundaments.Xand0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] board = generateBord();
        printBoard(board);
        while (true) {
            setSymbol(board);
            isLineWinner("x",board);
        }

    }

    public static String[][] generateBord() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "_";
            }

        }
        return board;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][i] + " ");
            }
            System.out.println();
        }
    }

    public static void setSymbol(String[][] board) {
        Scanner sc = new Scanner(System.in);
        String symbol = sc.next();

        Position symPosition = new Position(sc.nextInt(),sc.nextInt());
        symPosition.isPositionValid(sc, board);

        board[symPosition.row][symPosition.column] = symbol;
        printBoard(board);
    }


    public static boolean isLineWinner(String symbol, String[][]board){
        boolean isTrue = true;
        boolean isWinner = false;
        for (int row=0;row< board.length;row++){
            for (int col=0;col< board.length;col++){
                if(board[row][col].equals(symbol)){
                    isTrue = isTrue && true;
                }
                else{
                    isTrue = false;
                }
            }
            if (isTrue == true){
                isWinner = true;
            isTrue = true;

            }
        }
        System.out.println("Is winner");
        return isWinner;
    }

}