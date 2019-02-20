/* To create a ChessBoard pattern with the help of multidimensional array*/



package com.stackroute.pe3;

public class ChessBoard {

    public static void main (String[] args){

        String[][] board = new String [8][8];
        String[] chooser = {"WW","BB"};

        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                board[i][j] = chooser[(i+j)%2];
            }
        }

        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                String div = "|";
                if (j==7){
                    div = "";
                }
                System.out.print(board[i][j]+div);
            }
            System.out.println("");
        }

    }

}
