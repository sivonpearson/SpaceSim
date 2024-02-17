import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

//import java.awt.Graphics;
//import java.awt.Color;

public class WndwGraphics extends JPanel{
    Random rand = new Random();
    
    final static int WINDOW_WIDTH = 900;
    final static int WINDOW_HEIGHT = 900;
    public WndwGraphics() {
        setBackground(new Color(0, 0, 0));
        
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font currentFont = g.getFont();
        
        //planet 1
        g.setColor(PlanetVariables.planet1.getColor());
        g.fillOval((int)PlanetVariables.planet1.getX(), (int)PlanetVariables.planet1.getY(), PlanetVariables.planet1.getDiameter(), PlanetVariables.planet1.getDiameter());
        
        //planet 2
        g.setColor(PlanetVariables.planet2.color);
        g.fillOval((int)PlanetVariables.planet2.getX(), (int)PlanetVariables.planet2.getY(), PlanetVariables.planet2.getDiameter(), PlanetVariables.planet2.getDiameter());
        
        if(Timers.paused==true) {
            g.setColor(new Color(255, 255, 255));
            g.drawString("PAUSED", 0, 12);
        }
        g.setColor(new Color(255, 255, 255));
        g.drawString("x1: "+(int)PlanetVariables.planet1.getX()+", y1: "+(int)PlanetVariables.planet1.getY()+", d1: "+(int)PlanetVariables.planet1.getDiameter(), 0, 24);
        g.drawString("x2: "+(int)PlanetVariables.planet2.getX()+", y2: "+(int)PlanetVariables.planet2.getY()+", d2: "+(int)PlanetVariables.planet2.getDiameter(), 0, 36);
        g.drawString("accel1: "+PlanetVariables.planet1.getAccel()+", angle1: "+PlanetVariables.planet1.getAngle(), 0, 48);
        g.drawString("accel2: "+PlanetVariables.planet2.getAccel()+", angle2: "+PlanetVariables.planet2.getAngle(), 0, 60);
        g.drawString("col1: "+PlanetVariables.planet1.getCollisionStatus()+", t1: "+PlanetVariables.planet1.getCollisionTime(), 0, 72);
        g.drawString("col2: "+PlanetVariables.planet2.getCollisionStatus()+", t2: "+PlanetVariables.planet2.getCollisionTime(), 0, 84);
        
        repaint();
    }
}





