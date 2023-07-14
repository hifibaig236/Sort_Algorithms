package com.mycompany.tictactoe_game;
import java.util.Scanner; 

public class Tictactoe_game {
    public static void Printboard(char[][] board) {
        int n= board.length;
        System.out.println("Board");
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean checkBoard(char[][] board) {
        for(int i = 0; i < board.length ; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public static char Won(char[][] board) {
        
        for(int i = 0; i < board.length ; i++) {
            boolean Row = true;
            char value = board[i][0];
            if(value == '-') {
                Row = false;   
            }
            else {
                for(int j = 1; j < board[i].length; j++) 
                {
                    if(board[i][j] != value) {
                        Row = false;
                    }
                    break;
                }
            }
            if(Row) {
            return value;  
        }
    }
    for(int j = 0; j < board[0].length; j++) {
        boolean col = true;
        char value = board[0][j];
        if (value == '-'){
            col = false;
        }
        else {
            for (int i = 1; i < board[j].length; i++ ){
                if(board[i][j] != value){
                    col = false;
                }
                break;
            }
        }
        if(col) {
            return value;
        }
    }
    boolean Diagonal = true;
    char val1 = board[0][0];
    if(val1 == '-') {
        Diagonal = false;
    } else {
        for(int i = 1; i < board.length; i++) {
            if(board[i][i] != val1) {
                Diagonal = false;
                break;
            }
        }
    }
    if(Diagonal) {
        return val1;
    }
    boolean Semi_Diagonal = true;
    char val2 = board[0][board.length-1];
    
    if(val2 == '-') {
        Semi_Diagonal = false;
    } else {
        for(int i = 1; i < board.length; i++) {
            if(board[i][board.length-1-i] != val2) {
                Semi_Diagonal = false;
                break;
            }
        }
    }
    if(Semi_Diagonal) {
        return val2;
    }
      return ' ';
    }
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Tic Tac Toe is ready for play!\n");
        System.out.print("Player 1 name : ");
        String p1 = in.nextLine();
        System.out.print("Player 2 name :");
        String p2 = in.nextLine();
        int n = 3;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        char present= '-';
        boolean player1 = true;
        boolean game_end = false;
        while(!game_end) {
            Printboard(board);
            if(player1) {
                System.out.println(p1 + "'s Turn (x):");   
            } 
            else 
            {
                System.out.println(p2 + "'s Turn (o):");
                
            }
            if(player1){
                present='x';
            }
            else{
                present='o';
            }
            int ROW = 0;
            int COL = 0;

            while(true) {
                System.out.print("Enter Row number: ");
                ROW = in.nextInt();
                System.out.print("Enter Column number: ");
                COL = in.nextInt();
                if(ROW < 0 || COL < 0 || ROW >= n || COL >= n) {
                    System.out.println("This position is off the bounds of the board! Try again.");
                }
                else if(board[ROW][COL] != '-') {
                    System.out.println("Already made a move at this position! Try again.");    
                }
                else {
                    break;
                }
            }
            board[ROW][COL]= present;
            if(Won(board) == 'x') 
            {
                System.out.println("Congratulations "+p1 + " has won!");
                game_end = true;
            } 
            else if(Won(board) == 'o') {
               System.out.println("Congratulations "+p2 + " has won!");
               game_end = true;
            } 
            else {
                if(checkBoard(board)) {
                    System.out.println("It's a tie!");
                    game_end = true;
                } 
                else {
                    player1 = !player1; 
                }
            }
        }
        Printboard(board);
    }
}
