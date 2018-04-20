/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.*;


/**
 *
 * @author eleve9
 */
public class Tictactoe {

    // Déclarations de variable
    static char joueur1 ='X';
    static char joueur2 = 'O';
    static char[][] tab = new char[3][3];
    static boolean gameOver = false;
    
    
    
    
    public static void main(String[] args) {
        
        // Déclaration de variable
        Scanner place = new Scanner(System.in);
        int x, y = 0; // x = Ligne et y = Colonne
        
        // Lancement du jeu 
        print("WELCOME TO TIC TAC TOE\n");
        
        // Affiche le tableau
        afficheTab(3,3);
        Arrays.toString(tab); // Le Arrays.toString permet d'afficher des tableaux de tableaux
        
        
        print("Joueur 1, à ton tour (coord x,y): \n");
        print("x : ");
        x = place.nextInt();
        print("y : ");
        y = place.nextInt();
        tab[x][y] = joueur1;
        
        afficheTab(3,3);
        Arrays.toString(tab);
        
        
    }
    
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    public static void afficheTab(int i, int j) {
        print(" ___ ___ ___\n");
        for(i=0; i<tab.length; i++){
            print("|");
            Arrays.toString(tab[i]);
             for(j=0; j<tab.length; j++){
                 print("_" + tab[i][j] + "_|");
             }
             print("\n");
        }
    }
    
    
    
}
