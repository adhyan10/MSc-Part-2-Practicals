/*
 Write a program to resist obstacles.
 */
package practical7;
import ch.aplu.util.*;
import ch.aplu.robotsim.*;

/**
 *
 * @author Dhyanesh
 */
public class resistobst {
    resistobst()
    {
        LegoRobot r=new LegoRobot();
        Gear g =new Gear();
        
        TouchSensor ts1=new TouchSensor(SensorPort.S1);
        TouchSensor ts2=new TouchSensor(SensorPort.S2);
        r.addPart(g);
        r.addPart(ts1);
        r.addPart(ts2);
        g.forward();
        while(!QuitPane.quit())
        {
            Boolean t1=ts1.isPressed();
            Boolean t2=ts2.isPressed();
            
            if(t1 && t2)
            {
                g.backward(500);
                g.left(400);
                g.forward();
            }
            else
            {
                if(t1)
                {
                    g.backward(500);
                    g.left();
                    g.forward();
                }
                else
                {
                    if(t2)
                    {
                        g.backward(500);
                        g.right(100);
                        g.forward();
                    }
                }
            }
            Tools.delay(20);
        }
        
        r.exit();
    }
    public static void main(String[] args)
    {
        new resistobst();
    }
    static
    {
        RobotContext.setLocation(10, 10);
        RobotContext.setStartDirection(5);
        RobotContext.setStartPosition(100, 240);
        RobotContext.useObstacle(RobotContext.channel);
    }
    
}
