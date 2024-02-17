import java.util.*;

public class Timers {
    static boolean paused=true;
    public Timers() {
        java.util.Timer objMovement=new java.util.Timer();
        objMovement.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if(!paused) {
                    //planet 1
                    PlanetVariables.planet1.updateCollision(CalcsAndConstants.checkCollision(PlanetVariables.planet1, PlanetVariables.planet2));
                    
                    PlanetVariables.planet1.updateAngle(CalcsAndConstants.getAngle_rad((int)PlanetVariables.planet1.getX(), (int)PlanetVariables.planet1.getY(), 
                    PlanetVariables.planet1.getDiameter(), (int)PlanetVariables.planet2.getX(), (int)PlanetVariables.planet2.getY(), PlanetVariables.planet2.getDiameter()));
                    
                    //PlanetVariables.planet1.updateCollision(CalcsAndConstants.checkCollision(PlanetVariables.planet1, PlanetVariables.planet2));
                    
                    PlanetVariables.planet1.updateAccel(CalcsAndConstants.getGravAccel(PlanetVariables.planet2.getMass(), 
                    CalcsAndConstants.calcDistance(PlanetVariables.planet1.getX(), PlanetVariables.planet1.getY(), PlanetVariables.planet1.getDiameter(), PlanetVariables.planet2.getX(), PlanetVariables.planet2.getY(), PlanetVariables.planet2.getDiameter())));
                    
                    PlanetVariables.planet1.updateVel();
                    PlanetVariables.planet1.updatePos();
                    PlanetVariables.planet1.updateForce();
                    

                   
                    
                    //planet 2
                    PlanetVariables.planet2.updateCollision(CalcsAndConstants.checkCollision(PlanetVariables.planet2, PlanetVariables.planet1));
                    
                    PlanetVariables.planet2.updateAngle(CalcsAndConstants.getAngle_rad((int)PlanetVariables.planet2.getX(), (int)PlanetVariables.planet2.getY(), 
                    PlanetVariables.planet2.getDiameter(), (int)PlanetVariables.planet1.getX(), (int)PlanetVariables.planet1.getY(), PlanetVariables.planet1.getDiameter()));
                    
                    //PlanetVariables.planet2.updateCollision(CalcsAndConstants.checkCollision(PlanetVariables.planet2, PlanetVariables.planet1));
                    
                    PlanetVariables.planet2.updateAccel(CalcsAndConstants.getGravAccel(PlanetVariables.planet1.getMass(), 
                    CalcsAndConstants.calcDistance(PlanetVariables.planet2.getX(), PlanetVariables.planet2.getY(), PlanetVariables.planet2.getDiameter(), PlanetVariables.planet1.getX(), PlanetVariables.planet1.getY(), PlanetVariables.planet1.getDiameter())));
                    
                    PlanetVariables.planet2.updateVel();
                    PlanetVariables.planet2.updatePos();
                    PlanetVariables.planet2.updateForce();
                    
                }
            }
        },0,20);
    }
    public static void togglePause() {
        paused = !paused;
    }
    
}





