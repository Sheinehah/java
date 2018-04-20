/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exotab;
import java.util.*;

/**
 *
 * @author eleve9
 */
public class ExoTab {

    static int somme, max  = 0;
    static int taille; 
    static int[] tab;
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration de variable
        int i = 0;
        //int taille = 0; 
        //int[] tab;
        Scanner saisie = new Scanner(System.in);
        
        // Demande de saisie de la taille du tableau
        print("Veuillez le nombre d'entier à saisir: \n");
        taille = saisie.nextInt();
       
        // Initialise le tableau à la taille définie par l'utilisateur
        tab = new int[taille];
        // Affiche tableau
        afficheTab();
        
        // Demande de saisir les nombres entiers
        print("Entrez vos nombres: \n");
        for(int j=0; j<taille; j++){
            print("Tab[" + j + "]: ");
            tab[j] = saisie.nextInt();
            
        }
        afficheTab();
        
        
        //Somme du tableau 
        somme = sommeTab();
        print("La somme = " + somme + "\n");
        
        //Max du tableau 
        max = maxTab();
        print("Le max = " + max + "\n");
    }
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    public static void afficheTab() {
        for(int i=0; i<taille; i++){
            print("|" + tab[i]);
        }
        print("|\n");
    }
    
    public static int sommeTab(){
        for(int i=0; i<taille; i++){
            somme += tab[i];
        }
        return somme;
    }
    
    public static int maxTab() {
        for(int i=0; i<taille; i++){
            if(tab[i] > max)
                max = tab[i];
        }
        return max;
    }
    
    
    
}
