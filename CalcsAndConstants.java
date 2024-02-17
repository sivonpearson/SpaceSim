public class CalcsAndConstants {
    //G = 6.67 * Math.pow(10, -11);
    final static double G = 6.67 * Math.pow(10, -2); //UniversalGravitationalConstant
    
    //dist between their centers
    public static double calcDistance(double x1, double y1, int d1, double x2, double y2, int d2) {
        double differenceOfPoints_x = (x2 + (d2 / 2)) - (x1 + (d1 / 2)), differenceOfPoints_y = (y2 + (d2 / 2)) - (y1 + (d1 / 2));
        double dist=Math.sqrt(Math.pow(differenceOfPoints_x, 2)+Math.pow(differenceOfPoints_y, 2)); //(int)(Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))))
        return dist;
    }
    
    
    //angle is relative to point1
    public static double getAngle_rad(int point1_x, int point1_y, int d1, int point2_x, int point2_y, int d2) {
        double center1_x = point1_x + (d1 / 2);
        double center1_y = point1_y + (d1 / 2);
        double center2_x = point2_x + (d2 / 2);
        double center2_y = point2_y + (d2 / 2);
        
        double dx = center1_x - center2_x; //center1_x - (center2_x + d2 / 2)
        double dy = center2_y - center1_y; //(center2_y + d2 / 2) - center1_y
        double inRads = Math.atan2(dy, dx);
        //0 degrees is at 3:00, 270 at 12:00
        if(inRads<0) {
            inRads = inRads; //inRads = Math.abs(inRads)
        }
        else{
            inRads = 2 * Math.PI - inRads;
        }
        return Math.toRadians(Math.abs(180-Math.toDegrees(inRads)));
    }
    
    //calculation for acceleration due to gravity
    public static double getGravAccel(double mass, double distanceBetween) {
        double grav= (G * mass) / Math.pow(distanceBetween, 2);
        return grav;
    }
    
    //calculation for collision
    public static boolean checkCollision(PlanetObj a, PlanetObj b) {
        boolean status = calcDistance(a.getX(), a.getY(), a.getDiameter(), b.getX(), b.getY(), b.getDiameter()) <= (a.getDiameter() + b.getDiameter()) / 2;
        return status;
    }
    
    //calculation for orbital velocity
    public static double getOrbitalVel(PlanetObj oppositePlanet, double distanceBetween) {
        double oVel = Math.sqrt((G * oppositePlanet.getMass()) / distanceBetween);
        return oVel;
    }
}