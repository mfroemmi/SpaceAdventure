/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.spaceadventure;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author Marcel
 */
public class Label extends JLabel {

    private int temp = 0;
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (Var.imSpiel) {

            g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.icollect1, Var.collectx1[i], Var.collecty1[i], 48, 38, null);
            }
            for (int i = 0; i <= 1; i++) {
                g.drawImage(Var.icollect2, Var.collectx2[i], Var.collecty2[i], 48, 38, null);
            }
            g.drawImage(Var.icollect3, Var.collectx3, Var.collecty3, 48, 38, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
            }

            if (Var.flammeanimation == 0) {
                g.drawImage(Var.iflamme1, Var.x, Var.y + 53, 50, 50, null);
            } else if (Var.flammeanimation == 1) {
                g.drawImage(Var.iflamme2, Var.x, Var.y + 53, 50, 50, null);
            }
            
            if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-10, Var.y-10, 70, 90, null);
            } else if (Var.schildanzahl > Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildarraymax], Var.x-10, Var.y-10, 70, 90, null);
            }

            g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

            //Punktestand
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Collect: " + Var.collect, 20, 40);
            
            g.drawImage(Var.ileben, 600, 500, 50, 50, null);
            g.setFont(new Font("Arial", Font.BOLD, 55));
            g.drawString(""+Var.leben, 670, 545);
            g.setFont(new Font("Arial", Font.BOLD, 25));
            g.drawString("/ "+Var.maxleben, 735, 545);

            if (Var.kollidiert) {
                for (int i = 0; i <= 15; i++) {
                    if (Var.expanimation == i) {
                        g.drawImage(Var.iexplosion[i], Var.x - 10, Var.y - 10, 73, 100, null);
                    }
                }

                if (Var.expanimation > 1 && Var.expanimation <= 4) {
                    g.setColor(new Color(230, 0, 0, 45));
                    g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
                } else if (Var.expanimation > 6 && Var.expanimation <= 9) {
                    g.setColor(new Color(230, 0, 0, 45));
                    g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
                }

            }

            repaint();

        } else if (Var.imMenü || Var.imOptionen) {

            g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.icollect1, Var.collectx1[i], Var.collecty1[i], 48, 38, null);
            }
            for (int i = 0; i <= 1; i++) {
                g.drawImage(Var.icollect2, Var.collectx2[i], Var.collecty2[i], 48, 38, null);
            }
            g.drawImage(Var.icollect3, Var.collectx3, Var.collecty3, 48, 38, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
            }

            if (Var.flammeanimation == 0) {
                g.drawImage(Var.iflamme1, Var.x, Var.y + 53, 50, 50, null);
            } else if (Var.flammeanimation == 1) {
                g.drawImage(Var.iflamme2, Var.x, Var.y + 53, 50, 50, null);
            }
            
            if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-10, Var.y-10, 70, 90, null);
            } else if (Var.schildanzahl > Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildarraymax], Var.x-10, Var.y-10, 70, 90, null);
            }

            g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

            

        } else if (Var.verloren) {

            g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.icollect1, Var.collectx1[i], Var.collecty1[i], 48, 38, null);
            }
            for (int i = 0; i <= 1; i++) {
                g.drawImage(Var.icollect2, Var.collectx2[i], Var.collecty2[i], 48, 38, null);
            }
            g.drawImage(Var.icollect3, Var.collectx3, Var.collecty3, 48, 38, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
            }

            if (Var.flammeanimation == 0) {
                g.drawImage(Var.iflamme1, Var.x, Var.y + 53, 50, 50, null);
            } else if (Var.flammeanimation == 1) {
                g.drawImage(Var.iflamme2, Var.x, Var.y + 53, 50, 50, null);
            }
            
            if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-10, Var.y-10, 70, 90, null);
            } else if (Var.schildanzahl > Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildarraymax], Var.x-10, Var.y-10, 70, 90, null);
            }

            g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Collect: " + Var.collect, 310, 200);
            
        } else if (Var.imShop) {
            
            g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
            g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.icollect1, Var.collectx1[i], Var.collecty1[i], 48, 38, null);
            }
            for (int i = 0; i <= 1; i++) {
                g.drawImage(Var.icollect2, Var.collectx2[i], Var.collecty2[i], 48, 38, null);
            }
            g.drawImage(Var.icollect3, Var.collectx3, Var.collecty3, 48, 38, null);

            for (int i = 0; i <= 4; i++) {
                g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
            }

            if (Var.flammeanimation == 0) {
                g.drawImage(Var.iflamme1, Var.x, Var.y + 53, 50, 50, null);
            } else if (Var.flammeanimation == 1) {
                g.drawImage(Var.iflamme2, Var.x, Var.y + 53, 50, 50, null);
            }
            
            if (Var.schildanzahl > 0 && Var.schildanzahl <= Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-10, Var.y-10, 70, 90, null);
            } else if (Var.schildanzahl > Var.ischild.length) {
                g.drawImage(Var.ischild[Var.schildarraymax], Var.x-10, Var.y-10, 70, 90, null);
            }

            g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Collect: " + Var.collect, 310, 200);
            
            g.drawString("maxLeben", 75, 340);
            g.drawString("Schüsse", 75, 415);
            g.drawString("Plasmaschild", 75, 485);
            
            g.drawString("St. "+ Var.up1anzahl, 550, 340);
            g.drawString("St. "+ Var.up2anzahl, 550, 415);
            g.drawString("St. "+ Var.up3anzahl, 550, 485);
            
            g.drawString(Var.up1preis + "s", 310, 340);
            g.drawString(Var.up2preis + "s", 310, 415);
            g.drawString(Var.up3preis + "s", 310, 485);
            
            g.drawString(Var.uplebenpreis + "s", 700, 185);
            g.drawString("Leben + 1", 525, 235);
            
            g.setColor(Color.white);
            g.drawLine(50, 362, 750, 362);
            g.drawLine(50, 438, 750, 438);
            g.drawLine(300, 300, 300, 500);
            
            repaint();
        }

    }

}
