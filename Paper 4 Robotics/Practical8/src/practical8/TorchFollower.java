/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical8;
import ch.aplu.robotsim.*;

/**
 *
 * @author Dhyanesh
 */
public class TorchFollower {
    TorchFollower()
    {
        LegoRobot r=new LegoRobot();
        LightSensor lsFR=new LightSensor(SensorPort.S1,true);
        LightSensor lsFL=new LightSensor(SensorPort.S2,true);
        LightSensor lsRR=new LightSensor(SensorPort.S3,true);
        LightSensor lsRL=new LightSensor(SensorPort.S4,true);
        
        Gear g=new Gear();
        r.addPart(g);
        r.addPart(lsFR);
        r.addPart(lsFL);
        r.addPart(lsRL);
        r.addPart(lsRR);
        
        g.setSpeed(25);
        g.forward();
        double s=0.02;
        while(!r.isEscapeHit())
        {
            int vFR=lsFR.getValue();
            int vFL=lsFL.getValue();
            int vRR=lsRR.getValue();
            int vRL=lsRL.getValue();
            
            double d=1.0*(vFL-vFR)/(vFL+vFR);
            
            if(vRL + vRR> vFL+vFR)
                g.left();
            else if(d>-s && d<s)
                g.forward();
            else
            {
                if(d>=s)
                    g.leftArc(0.05);
                else
                    g.rightArc(0.05);
            }
            Tools.delay(100);
        }
        r.exit();
    }
    public static void main(String[] args)
    {
        TorchFollower tf=new TorchFollower();
    }
    static
    {
        RobotContext.useTorch(1, 150, 250, 100);
    }
}
