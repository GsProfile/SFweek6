/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author dancye
 */
public class RadioSimulator 
{
    public static void main(String[] args)
    {
        //1. create a new Radio Object
        Radio r1 = new Radio();
        System.out.println(r1.getStation());
        System.out.println(r1.getVolume());
        System.out.println(r1.isIsOn());
        //2. perform some use cases
        //3. turn the radio on
        r1.setIsOn(true);
        //4. set the station within our boundary
        System.out.println(r1.setStation(104.5));
        //5. power off the radio
        r1.setIsOn(false);
        //6. Try an alternate path (to set the station to 110)
        System.out.println(r1.setStation(110));
        //7. Try the boundary case for the station
        System.out.println(r1.setStation(108));
    }
}
