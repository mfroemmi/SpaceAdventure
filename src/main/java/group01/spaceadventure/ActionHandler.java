/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.spaceadventure;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marcel
 */
public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Var.btnresume) {

            Var.imSpiel = true;
            Var.imShop = false;
            Var.imMenü = false;
            Var.imOptionen = false;
            Var.btnresume.setVisible(false);
            Var.btnoption.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnexit.setVisible(false);

            Var.btnupgrade1.setVisible(false);
            Var.btnupgrade2.setVisible(false);
            Var.btnupgrade3.setVisible(false);
            Var.btnleben.setVisible(false);

            KeyHandler.tempKeyHandler = 0;
            Aktualisierung.tempAktualisierung = 0;

            Var.jf1.requestFocus();

        } else if (e.getSource() == Var.btnshop) {

            Var.imSpiel = false;
            Var.imShop = true;
            Var.imMenü = false;
            Var.imOptionen = false;
            Var.btnresume.setVisible(true);
            Var.btnoption.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnexit.setVisible(false);

            Var.btnupgrade1.setVisible(true);
            Var.btnupgrade2.setVisible(true);
            Var.btnupgrade3.setVisible(true);
            Var.btnleben.setVisible(true);

            KeyHandler.tempKeyHandler = 1;

            Var.jf1.requestFocus();

        } else if (e.getSource() == Var.btnoption) {

            Var.imSpiel = false;
            Var.imShop = false;
            Var.imMenü = false;
            Var.imOptionen = true;
            Var.btnresume.setVisible(true);
            Var.btnoption.setVisible(false);
            Var.btnshop.setVisible(false);
            Var.btnexit.setVisible(false);

            KeyHandler.tempKeyHandler = 1;

            Var.jf1.requestFocus();

        } else if (e.getSource() == Var.btnexit) {
            System.exit(0);
            
        } else if (e.getSource() == Var.btnupgrade1) {
            if (Var.collect >= Var.up1preis) {
                Var.maxleben += 1;
                //Var.leben = Var.maxleben;
                Var.collect -= Var.up1preis;
                Var.up1preis = Var.up1preis + Var.up1preis / 2;
                Var.up1anzahl += 1;
            }
            Var.jf1.requestFocus();
            
        } else if (e.getSource() == Var.btnupgrade2) {
            if (Var.collect >= Var.up2preis) {
                Var.collect -= Var.up2preis;
                Var.up2preis = Var.up2preis + Var.up2preis / 2;
                Var.up2anzahl += 1;
            }
            Var.jf1.requestFocus();
            
        } else if (e.getSource() == Var.btnupgrade3) {
            if (Var.collect >= Var.up3preis) {
                Var.collect -= Var.up3preis;
                Var.up3preis = Var.up3preis + Var.up3preis / 2;
                Var.up3anzahl += 1;
                
                Var.schildanzahl = Var.up3anzahl;
            }
            Var.jf1.requestFocus();
            
        } else if (e.getSource() == Var.btnleben) {
            if (Var.collect >= Var.uplebenpreis && Var.leben < Var.maxleben) {
                Var.collect -= Var.uplebenpreis;
                Var.leben += 1;
            }
            Var.jf1.requestFocus();
        }

    }

}
