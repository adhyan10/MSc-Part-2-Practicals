/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract5;
import java.io.*;
import java.util.logging.*;

/**
 *
 * @author Dhyanesh
 */
public class MyLogger {
    public static void main(String args[])
    {
        Logger l=Logger.getLogger(MyLogger.class.getName());
        FileHandler fh;
    
    try
{
fh=new FileHandler("c:/users/Dhyanesh/desktop/mylogfile.log",true);
l.addHandler(fh);
l.setLevel(Level.ALL);
SimpleFormatter sf=new SimpleFormatter();

fh.setFormatter(sf);
l.info("My first log");
}
catch(SecurityException e)
{
e.printStackTrace();
}

catch(IOException e)
{
e.printStackTrace();
}
    
}
}
