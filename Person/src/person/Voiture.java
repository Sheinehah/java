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
public class Voiture {

    protected int nbPassager, km, prix;
    protected String couleur, marque;
    
    public Voiture() {
        
    }
    
    public Voiture(String couleur, int nbPassager, int km, int prix, String marque) {
        this.couleur = couleur;
        this.nbPassager = nbPassager;
        this.km = km;
        this.prix = prix;
        this.marque = marque;
        
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    public void print(Object a){
        System.out.print(a);
    }
}
