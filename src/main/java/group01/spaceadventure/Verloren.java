/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.spaceadventure;

import static group01.spaceadventure.KeyHandler.tempKeyHandler;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Marcel
 */
public class Verloren {

    Timer loose;
    private int temp = 0, temp1 = 0, temp2 = 0;

    public Verloren() {

        loose = new Timer();
        loose.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.verloren) {
                    if (temp >= 0 && temp <= 100) {
                        temp++;
                    } else if (temp == 101) {

                        //Menü
                        Var.imSpiel = false;
                        Var.imMenü = false;
                        Var.imOptionen = false;
                        Var.imShop = true;
                        Var.btnresume.setVisible(true);
                        Var.btnshop.setVisible(false);
                        Var.btnoption.setVisible(false);
                        Var.btnexit.setVisible(false);

                        Var.btnupgrade1.setVisible(true);
                        Var.btnupgrade2.setVisible(true);
                        Var.btnupgrade3.setVisible(true);
                        Var.btnleben.setVisible(true);

                        KeyHandler.tempKeyHandler++;

                        Var.btnresume.requestFocus();
                        Var.jf1.requestFocus();

                        //Collect-Platzierung
                        for (int i = 0; i <= 4; i++) {
                            Var.collectx1[i] = 20 + temp1;
                            Var.collecty1[i] = -200 - temp1;

                            temp1 += 160;
                        }

                        Var.collectx2[0] = 266;
                        Var.collectx2[1] = 532;
                        Var.collecty2[0] = -1000;
                        Var.collecty2[1] = -1500;

                        Var.collectx3 = 375;
                        Var.collecty3 = -4000;

                        //Gegner-Platzierung
                        for (int i = 0; i >= 4; i++) {
                            Var.gegnery[i] = 0;
                        }

                        for (int i = 0; i <= 4; i++) {
                            Var.gegnery[i] = -100 - temp2;

                            temp2 += 160;
                        }

                        temp = 0;

                        Var.collect = 0;
                        
                        Var.maxleben = Var.startleben;
                        Var.leben = Var.startleben;
                        Var.up1anzahl = 0;
                        Var.up3anzahl = 0;
                        Var.up1preis = 50;
                        Var.up2preis = 100;
                        Var.up3preis = 150;
                        Var.verloren = false;
                    }

                }
            }

        }, 0, 15);

    }

}
