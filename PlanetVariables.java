import java.awt.*;
import java.util.*;

public class PlanetVariables {
    Random rand = new Random();
    
    final static int numPlanetObj = 2;
    
    static PlanetObj planet1;
    static PlanetObj planet2;
    //static PlanetObj planet[] = new PlanetObj[numPlanetObj];
    
    public PlanetVariables() {
        //x, y, diameter, mass, vel, accel, angleRads, color
        planet1 = new PlanetObj(400, 435, 30, 1000, 0, 0, 0, getRandPlanetColor()); //400, 435
        planet2 = new PlanetObj(50, 435, 30, 10, 0, 0, 0, getRandPlanetColor());
        planet2.setVel_y(CalcsAndConstants.getOrbitalVel(planet1, CalcsAndConstants.calcDistance(PlanetVariables.planet1.getX(), PlanetVariables.planet1.getY(), PlanetVariables.planet1.getDiameter(), PlanetVariables.planet2.getX(), PlanetVariables.planet2.getY(), PlanetVariables.planet2.getDiameter())));
        
    }
    public Color getRandPlanetColor() {
        int r = 0, g = 0, b = 0;
        int randNum = rand.nextInt(3);
        switch(randNum) {
            case 0:
                r = 75;
                break;
            case 1:
                g = 75;
                break;
            case 2:
                b = 75;
                break;
        }
        randNum = rand.nextInt(3);
        switch(randNum) {
            case 0:
                r += rand.nextInt(255 - r);
                break;
            case 1:
                g += rand.nextInt(255 - g);
                break;
            case 2:
                b += rand.nextInt(255 - b);
                break;
        }
        Color color = new Color(r, g, b);
        return color;
    }
}



