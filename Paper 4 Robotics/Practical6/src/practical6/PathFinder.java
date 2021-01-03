/*
 Write a program to create a path following robot.
 */
package practical6;
import ch.aplu.robotsim.*;
/**
 *
 * @author Dhyanesh
 */
public class PathFinder {
    PathFinder()
    {
        NxtRobot r=new NxtRobot();
        Gear g=new Gear();
        LightSensor ls1=new LightSensor(SensorPort.S1);
        LightSensor ls2=new LightSensor(SensorPort.S2);
        r.addPart(g);
        r.addPart(ls1);
        r.addPart(ls2);
        g.forward();
        
        while(true)
        {
            int rightValue=ls1.getValue();
            int leftValue=ls2.getValue();
            int d=rightValue-leftValue;
            if(d>100)
                g.rightArc(0.1);
            if(d<-100)
                g.leftArc(0.1);
            if(d>-100 && d<100 && rightValue>500)
                g.forward();
        }
        
    }
    public static void main(String args[])
    {
        new PathFinder();
        
    }
    static
    {
        NxtContext.setStartPosition(250,490);
        NxtContext.setStartDirection(-90);
        NxtContext.useBackground("sprites/path.gif");
    }
    
}
