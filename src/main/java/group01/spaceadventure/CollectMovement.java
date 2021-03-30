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
public class CollectMovement {

    Timer movement;
    private int temp = 0;

    public CollectMovement() {

        for (int i = 0; i <= 4; i++) {
            Var.collectx1[i] = 20 + temp;
            Var.collecty1[i] = -200 - temp;

            temp += 160;
        }

        Var.collectx2[0] = 266;
        Var.collectx2[1] = 532;
        Var.collecty2[0] = -1000;
        Var.collecty2[1] = -1500;

        Var.collectx3 = 375;
        Var.collecty3 = -4000;

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.imSpiel) {

                    for (int i = 0; i <= 4; i++) {
                        Var.collecty1[i] += Var.collectspeed1[i];

                        if (Var.collecty1[i] >= Var.screenheight) {
                            Var.collecty1[i] = -350;
                        }
                    }

                    for (int i = 0; i <= 1; i++) {
                        Var.collecty2[i] += Var.collectspeed2[i];

                        if (Var.collecty2[i] >= Var.screenheight) {
                            Var.collecty2[i] = -1500;
                        }
                    }

                    Var.collecty3 += Var.collectspeed3;

                    if (Var.collecty3 >= Var.screenheight) {
                        Var.collecty3 = -1500;

                    }

                }
            }
        }, 0, 9);

    }

}
