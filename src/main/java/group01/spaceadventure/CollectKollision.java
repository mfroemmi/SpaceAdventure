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
public class CollectKollision {

    Timer kollision;

    public CollectKollision() {

        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                //Bronze
                for (int i = 0; i <= 4; i++) {

                    if (Var.x >= Var.collectx1[i] - 20 && Var.x <= Var.collectx1[i] + 35
                            && Var.y >= Var.collecty1[i] - 50 && Var.y <= Var.collecty1[i] + 20) {

                        Var.collect += 1;
                        Var.collecty1[i] = -200;

                    }

                }

                //Silber
                for (int i = 0; i <= 1; i++) {

                    if (Var.x >= Var.collectx2[i] - 20 && Var.x <= Var.collectx2[i] + 35
                            && Var.y >= Var.collecty2[i] - 50 && Var.y <= Var.collecty2[i] + 20) {

                        Var.collect += 5;
                        Var.collecty2[i] = -1500;

                    }

                }

                //Gold
                if (Var.x >= Var.collectx3 - 20 && Var.x <= Var.collectx3 + 35
                        && Var.y >= Var.collecty3 - 50 && Var.y <= Var.collecty3 + 20) {

                    Var.collect += 10;
                    Var.collecty3 = -4000;

                }

            }

        }, 0, 15);

    }

}
