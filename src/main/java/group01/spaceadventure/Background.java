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
public class Background {

    Timer back;

    public Background() {

        back = new Timer();
        back.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.imSpiel) {

                    if (Var.backgroundY1 < 596) {
                        Var.backgroundY1 += 2;
                    } else {
                        Var.backgroundY1 = -600;
                    }

                    if (Var.backgroundY2 < 596) {
                        Var.backgroundY2 += 2;
                    } else {
                        Var.backgroundY2 = -600;
                    }
                }
            }

        }, 0, Var.backgroundspeed);

    }

}
