/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoestack;
import java.util.Scanner;
/**
 *
 * @author eleve9
 */



public class TictactoeStack {

    static Scanner keyboard = new Scanner(System.in);
    static int counter;
    static String player1, player2;
    static boolean gameOver = false;
    static char[][] board = new char[3][3];
    static char playerMarker;

    public static void main(String[] args) {

        setupPlayers();
        printBoard();
        setupBoard();
        makeMove();
    }

    public static void setupBoard() {
        for (int i = 0; i < 3; i++)
            for (int k = 0; k < 3; k++)
                board[i][k] = ' ';


    }

    static public void printBoard() {
        System.out.println("\n");
        System.out.println(board[0][0] + "   |" + board[0][1] + "   |" + board[0][2]);
        System.out.println("-----------");
        System.out.println(board[1][0] + "   |" + board[1][1] + "   |" + board[1][2]);
        System.out.println("-----------");
        System.out.println(board[2][0] + "   |" + board[2][1] + "   |" + board[2][2]);

    }

    public static void setupPlayers() {

        System.out.print("Player1, what's your name?: ");
        player1 = keyboard.next();
        System.out.print("Alright " + player1 + ", who's Player2?");
        player2 = keyboard.next();
        System.out.print(player1 + " versus. " + player2 + ", good luck!");
    }

    public static void makeMove()
    {
        System.out.println("Enter a row and a column: ");
        int row = keyboard.nextInt();
        int col = keyboard.nextInt();

        while (board[row][col] != ' ')
        {
            System.out.println("\nCoordinates already in use. Please try again: ");

        }
    }
}