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
public class withgears {
    withgears()
    {
        NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        
        gear.forward(400);
        gear.setSpeed(30);
        
        gear.left(800);
        gear.forward(200);
        gear.right(480);
        robot.exit();    
    }
    public static void main(String args[])
    {
        withgears m=new withgears();
    }
}