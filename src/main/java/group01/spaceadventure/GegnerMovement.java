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
public class GegnerMovement {

    Timer movement;
    private int temp = 0;

    public GegnerMovement() {

        for (int i = 0; i <= 4; i++) {
            Var.gegnerx[i] = 20 + temp;
            Var.gegnery[i] = -100 - temp;

            temp += 160;
        }

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.imSpiel) {

                    for (int i = 0; i <= 4; i++) {
                        Var.gegnery[i] += Var.gegnerspeed[i];

                        if (Var.gegnery[i] >= Var.screenheight) {
                            Var.gegnery[i] = -100;
                        }
                    }

                }
            }
        }, 0, 9);

    }

}
