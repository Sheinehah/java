/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.*;

/**
 *
 * @author eleve9
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    
    // Déclaration de variable
    static String nom, prenom;
    static Scanner saisie = new Scanner(System.in);
    static String reponse;
    static int prix, crediter, compte, choix;
    static ArrayList<NewClassTest> L = new ArrayList<NewClassTest>();
    
    public static void main(String[] args) {
        
        print("Bonjour\n");
//        menu();
//
//        switch(choix){
//            case 1 : createAccount(); break;
//            case 2 : 
//        }
//        
//        L.add(new NewClassTest(nom,prenom, compte));
//        
//        for(int i=0; i<L.size(); i++) {
//
//            print("\nAvez-vous été payé ? ");
//            reponse = saisie.nextLine();
//
//            if("oui".equals(reponse) || "OUI".equals(reponse)) {
//                print("\nCombien avez vous été payé ? ");
//                crediter = saisie.nextInt();
//            }
////            print("\nHello " + L.getNom());
////           
////
////            L.crediter(crediter);
////
////            print("\nQuel est le prix que vous devez payer ? ");
////            prix = saisie.nextInt();
////            L.payer(prix);
//        }
        
        Camion c = new Camion();
        print("La coueleur de voiture est " + c.getCouleur() + " au prix de " + c.getPrix() + " EURO\n\n");
        Suv s = new Suv();
   
        s.getMarque();
        
        Voiture v = new Camion();
        
        
    }
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    public static void menu(){
        print("TAPEZ : "
                + "\n1- Pour créer un nouveau compte"
                + "\n2- Rentrer votre paye"
                + "\n3- Saisir le prix à dépenser"
                + "\n0- Quitter "
        );
        choix = saisie.nextInt();
    }
    
    public static void createAccount(){
        print("Veuillez entrer votre nom : ");
        nom = saisie.nextLine();
        print("Veuillez entrer votre prenom : ");
        prenom = saisie.nextLine();
        print("Veuillez entrer votre solde de votre compte : ");
        compte = saisie.nextInt();
        
        L.add(new NewClassTest(nom, prenom, compte));
    }
    
    /*
    public void markChoice(){
        // Déclaration de variable
        int choice;
        Scanner saisie = new Scanner(System.in);
        
        print("Choisissez votre marque : "
                + "\n1- Toyota"
                + "\n2- Suzuki"
                + "\n3- Dodge"
                + "\n4- Porche"
                + "\n5- Wolfswogen");
        choice = saisie.nextInt();
        
        switch(choice){
            case 1 : print("de "); break;
            case 2 : print("de couleur bleu turquoi"); break;
            case 3 : print("de couleur noir"); break;
            case 4 : print("de couleur gris"); break;
            case 5 : print("de couleur rouge"); break;
            default: print("Veuillez entrer un chiffre entre 1 et 5 ");
        }
    }
    
    public void colorChoice(){
        // Déclaration de variable
        int choice;
        Scanner saisie = new Scanner(System.in);
        
        print("Choisissez votre couleur : "
                + "\n1- Bleu"
                + "\n2- Bleu turquoi"
                + "\n3- Noir"
                + "\n4- Gris"
                + "\n5- Rouge");
        choice = saisie.nextInt();
        
        switch(choice){
            case 1 : print("de couleur bleu"); break;
            case 2 : print("de couleur bleu turquoi"); break;
            case 3 : print("de couleur noir"); break;
            case 4 : print("de couleur gris"); break;
            case 5 : print("de couleur rouge"); break;
            default: print("Veuillez entrer un chiffre entre 1 et 5 ");
        }
    }
    */
    
    
    
}
