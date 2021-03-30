/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group01.spaceadventure;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marcel
 */
public class Var {

    static JFrame jf1;
    static Label lbl1;
    
    static int screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 10;
    static int x = 400, y = 400;
    static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
    static int flammeanimation, expanimation;
    static int collect = 0, startleben = 2, leben = 2, maxleben = 2;
    static int up1anzahl = 0, up2anzahl = 0, up3anzahl = 0;
    static int up1preis = 50, up2preis = 100, up3preis = 150, uplebenpreis = 50;
    static int schildanzahl = 0, schildarraymax = 3;

    static JButton btnresume, btnshop, btnoption, btnexit;
    static JButton btnmute;
    static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnleben;

    static int gegnerx[] = new int[5], gegnery[] = new int[5];
    static int gegnerspeed[] = new int[5];
    static int collectx1[] = new int[5], collecty1[] = new int[5];
    static int collectx2[] = new int[5], collecty2[] = new int[5];
    static int collectx3, collecty3;
    static int collectspeed1[] = new int[5], collectspeed2[] = new int[2], collectspeed3;

    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static boolean kollidiert = false, verloren = false;
    static boolean imSpiel = true, imMenü = false, imOptionen = false, imShop = false;

    static BufferedImage ib1, ib2;
    static BufferedImage irakete, iflamme1, iflamme2;
    static BufferedImage igegner1;
    static BufferedImage icollect1, icollect2, icollect3;
    static BufferedImage iexplosion[] = new BufferedImage[16];
    static BufferedImage ileben;
    static BufferedImage ischild[] = new BufferedImage[4];

    public Var() {

        try {

            //Background
            ib1 = ImageIO.read(new File("rsc/b1.png"));
            ib2 = ImageIO.read(new File("rsc/b1.png"));
            //Rakete
            irakete = ImageIO.read(new File("rsc/rakete.png"));
            //Flamme
            iflamme1 = ImageIO.read(new File("rsc/flamme1.1.png"));
            iflamme2 = ImageIO.read(new File("rsc/flamme1.2.png"));
            //Gegner
            igegner1 = ImageIO.read(new File("rsc/gegner1.png"));
            //Leben
            ileben = ImageIO.read(new File("rsc/leben.png"));
            //Collect
            icollect1 = ImageIO.read(new File("rsc/collect1.png"));
            icollect2 = ImageIO.read(new File("rsc/collect2.png"));
            icollect3 = ImageIO.read(new File("rsc/collect3.png"));
            //Explosion
            for (int i = 0; i <= 15; i++) {
                iexplosion[i] = ImageIO.read(new File("rsc/exp" + (i + 1) + ".png"));
            }
            //Schild
            for (int i = 0; i < ischild.length; i++) {
                ischild[i] = ImageIO.read(new File("rsc/schild" + (i + 1) + ".png"));
            }

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden!");

        }

        gegnerspeed[0] = 3;
        gegnerspeed[1] = 4;
        gegnerspeed[2] = 3;
        gegnerspeed[3] = 4;
        gegnerspeed[4] = 3;

        collectspeed1[0] = 2;
        collectspeed1[1] = 3;
        collectspeed1[2] = 2;
        collectspeed1[3] = 4;
        collectspeed1[4] = 3;

        collectspeed2[0] = 4;
        collectspeed2[1] = 5;

        collectspeed3 = 6;

        Musik.music("rsc/track1.wav");

    }

}
