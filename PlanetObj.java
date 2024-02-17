import java.awt.*;
public class PlanetObj {
    double x; //x-pos
    double y; //y-pos
    int diameter; //diameter
    
    double vel;
    double vel_x;
    double vel_y;
    double accel;
    double accel_x;
    double accel_y;
    double angleRads = 0;
    
    int mass; //kilograms
    double force = 0;
    double force_x = 0;
    double force_y = 0;
    
    Color color;
    
    boolean collision = false;
    int collision_t = 0;
    public PlanetObj(double x, double y, int diameter, int mass, double vel, double accel, double angleRads, Color color) {
        this.x=x;
        this.y=y;
        this.diameter=diameter;
        this.mass=mass;
        this.vel=vel;
        this.accel=accel;
        this.angleRads=angleRads;
        this.color=color;
    }
    
    public void updateAngle(double angle) {
        angleRads = angle;
    }
    public void updateAccel(double acceleration) {
        accel = acceleration;
        accel_x = acceleration * Math.cos(angleRads);
        accel_y = acceleration * Math.sin(angleRads);
    }
    public void updateVel() {
        vel += accel;
        vel_x += accel_x;
        vel_y += accel_y;
    }
    public void updatePos() {
        //multiplied by 50 is here b/c timer updates every 20ms
        x += vel_x;
        y += vel_y;
    }
    public void updateForce() {
        force = mass * accel;
        force_x = mass * accel_x;
        force_y = mass * accel_y;
    }
    public void updateCollision(boolean col) {
        collision = col;
        if(collision == true && collision_t == 0) {
            vel_x = vel * Math.cos(angleRads - Math.PI);
            vel_y = vel * Math.sin(angleRads - Math.PI);
            collision_t = 20;
        }
        if(collision_t > 0) {
            collision_t--;
        }
    }
    public void setVel_x(double velocity) {
        vel_x = velocity;
    }
    public void setVel_y(double velocity) {
        vel_y = velocity;
    }
    
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getDiameter() {
        return diameter;
    }
    public int getMass() {
        return mass;
    }
    public Color getColor() {
        return color;
    }
    public double getAccel() {
        return accel;
    }
    public double getVel() {
        return vel;
    }
    public double getAngle() {
        return angleRads;
    }
    public boolean getCollisionStatus() {
        return collision;
    }
    public int getCollisionTime() {
        return collision_t;
    }
}
