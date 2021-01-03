/*
Write a program to do a square using a while loop, 
doing steps with a for loop, to change directions based on condition, 
controlling motor speed using switch case
 */
package practical3;
import ch.aplu.robotsim.*;

/**
 *
 * @author Dhyanesh
 */
public class MakeSquare {
    MakeSquare()
    {
        NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        gear.setSpeed(100);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        gear.left(275);
        gear.forward(1000);
        
        Tools.delay(2000);
        robot.exit();
        
    }
    public static void main(String args[])
    {
        new MakeSquare();
    }
}
