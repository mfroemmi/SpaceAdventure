/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.spaceadventure;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Marcel
 */
public class Aktualisierung {
    
    Timer aktual;
    static int tempAktualisierung = 0;
    
    public Aktualisierung () {
        
       aktual = new Timer();
       aktual.scheduleAtFixedRate(new TimerTask() {
           
           @Override
           public void run() {
               
               if (Var.imMenü) {
                   if (tempAktualisierung == 0) {
                       Var.btnresume.requestFocus();
                       Var.btnshop.requestFocus();
                       Var.btnoption.requestFocus();
                       Var.btnexit.requestFocus();
                       
                       tempAktualisierung ++;
                   }else if (tempAktualisierung == 1) {
                       Var.jf1.requestFocus();
                   }
               }
               
           }

       }, 0, 50);
       
        
    }
    
}
