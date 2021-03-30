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
public class FlammeAnimation {

    Timer flamme;
    private int temp = 0;

    public FlammeAnimation() {
        flamme = new Timer();
        flamme.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.imSpiel) {

                    if (temp == 0) {
                        Var.flammeanimation = 0;
                        temp++;
                    } else if (temp == 1) {
                        Var.flammeanimation = 1;
                        temp--;
                    }

                }
            }
        }, 0, 100);

    }

}
