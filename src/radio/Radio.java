/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * A Class to model a basic radio
 * @author dancye, 2019
 */
public class Radio 
{
    private boolean isOn;
    private double station;
    private int volume;
    public static final double LOWEST_FM = 88.0;
    public static final double HIGHEST_FM = 108.0;

    /**
     * @return the power status
     */
    public boolean isIsOn() {
        return isOn;
    }

    /**
     * @param isOn - the power indicator
     */
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * @return the station
     */
    public double getStation() {
        return station;
    }

    /**
     * @param station the station to set
     * @return the message associated with the operation
     */
    public String setStation(double station) 
    {
        String successMessage = "";
        if((station>=LOWEST_FM) &&(station<=HIGHEST_FM) )
        {
            this.station = station;
            successMessage = "successfully tuned to " + station;
        }
        else
        {
            successMessage = "incorrect range, must be between: " + LOWEST_FM + " and " + HIGHEST_FM;
        }
        return successMessage;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
}
