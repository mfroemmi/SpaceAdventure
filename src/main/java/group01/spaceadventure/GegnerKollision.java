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
public class GegnerKollision {

    Timer kollision;
    private int temp = 0;

    public GegnerKollision() {

        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.imSpiel) {

                    for (int i = 0; i <= 4; i++) {
                        if (temp == 0) {
                            if (Var.x >= Var.gegnerx[i] - 30 && Var.x <= Var.gegnerx[i] + 55
                                    && Var.y >= Var.gegnery[i] - 70 && Var.y <= Var.gegnery[i] + 35) {

                                Var.kollidiert = true;
                                Var.gegnery[i] = -100;

                                if (Var.schildanzahl > 0) {
                                    Var.schildanzahl -= 1;
                                } else if (Var.schildanzahl == 0) {
                                    if (Var.leben >= 1) {
                                        Var.leben -= 1;
                                    }

                                    if (Var.leben == 0) {
                                        Var.verloren = true;
                                        Var.imSpiel = false;
                                    } else if (Var.leben >= 0) {
                                        Var.verloren = false;
                                    }
                                }

                                temp++;

                            }
                        }
                    }

                    if (temp >= 1 && temp <= 45) {
                        temp++;
                    } else if (temp == 46) {
                        temp = 0;
                    }

                }
            }
        }, 0, 15);

    }

}
