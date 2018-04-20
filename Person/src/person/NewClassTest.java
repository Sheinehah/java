/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author eleve9
 */
public class NewClassTest {
    private String nom, prenom; 
    private int money;
    
    public NewClassTest(String nom, String prenom, int money) {
        this.nom = nom;
        this.prenom = prenom;
        this.money = money;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void crediter(int amount){
        this.money +=  amount;
        System.out.println("\nVous avez : " + this.money + " sur votre compte");
    }
    
    public boolean payer(int amount){
        
        if(amount < money) {
            this.money -= amount;
            System.out.println("\nIl vous reste : " + this.money + " sur votre compte");
            return true;
        }
        else{
            System.out.print("Vous n'avez pas assez d'argent, vous n'avez que " + this.money);
            return false;
        }
    }
    
    public void travailler(){
        
    }
}
