/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Math.random;
import java.util.List;
import java.util.Random;
import model.Carte;

/**
 *
 * @author deme
 */
public class Robots extends Joueur{
        private List<Carte> listCarte;
        

    public Robots(String nom, double mise) {
        super(nom, mise);
    }
        
        public void jouerUneCarte()
        {
           
        }

    public boolean demanderCarte(){
       /*if(this.getPoids()>=15){
           if(this.getPoids()>=21){
             return false;           
           }else{
                Random ran = new Random();
                return ran.nextBoolean();
           }
           */
       if(this.getPoids()>=15){
           if(this.getPoids()>=21){
               return false;
           }else{
                 Random ran = new Random();
                return ran.nextBoolean();
           }
           }
           else{
           return true;
       }
    }
}
