/*
Write a program to create a robot with a two motor and move it
forward, left, right
 */
package practical2;
import ch.aplu.robotsim.*;

/**
 *
 * @author Dhyanesh
 */
public class MoveIt {
    MoveIt()
    {
     NxtRobot robot=new NxtRobot();
     Motor motA=new Motor(MotorPort.A);
     Motor motB=new Motor(MotorPort.B);
     robot.addPart(motA);
     robot.addPart(motB);
     motA.forward();
     motB.forward();
     Tools.delay(2000);
     
     motA.stop();
     Tools.delay(1050);
     motA.forward();
     Tools.delay(2000);
     
     motB.stop();
     Tools.delay(1050);
     motB.forward();
     Tools.delay(2000);
     
     robot.exit();
    }
    public static void main(String args[])
    {
        new MoveIt();
    }
    
}
