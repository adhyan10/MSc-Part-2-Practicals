/*
 Write a program to create a robot that does a circle 
using 2 motors
 */
package practical5;
import ch.aplu.robotsim.*;

/**
 *
 * @author Dhyanesh
 */
public class MakeCircle {
    MakeCircle()
    {
        NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        gear.setSpeed(60);
        gear.leftArc(0.2,7000);
        gear.rightArc(0.2);
        Tools.delay(5000);
        robot.exit();
    }
    public static void main(String args[])
    {
        new MakeCircle();
    }
    
}
