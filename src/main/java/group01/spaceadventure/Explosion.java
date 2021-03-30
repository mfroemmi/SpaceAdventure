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
public class Explosion {

    Timer exp;
    private int temp = 0;

    public Explosion() {

        exp = new Timer();
        exp.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.imSpiel) {

                    if (Var.kollidiert) {
                        if (temp < 15) {
                            Var.expanimation = temp;
                            temp++;
                        } else {
                            Var.expanimation = 15;
                            temp = 0;
                            Var.kollidiert = false;
                        }
                    }

                }
            }
        }, 0, 40);

    }

}
