/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;
import ch.aplu.robotsim.*;
/**
 *
 * @author Dhyanesh
 */
public class withoutgears {
    withoutgears()
    {
        TurtleRobot robot =new TurtleRobot();
        robot.forward(50);
        robot.left(45);
        robot.forward(20);
        robot.right(90);
        robot.backward(100);
        robot.exit();
        
    }
    public static void main(String args[])
    {
        withoutgears m= new withoutgears();
       
    }
    
}
