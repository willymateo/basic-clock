/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clock;

import controller.threads.CronometerThread;
import model.clockElements.TimeElement;

/**
 *
 * @author Willy Mateo
 */
public class HourFormat {
    private final TimeElement[] timeElements;

    public HourFormat(TimeElement[] timeElements) {
        this.timeElements = timeElements;
    }

    public void work(){
        Thread hourThread = new Thread(new CronometerThread(timeElements[0]));
        Thread minThread = new Thread(new CronometerThread(timeElements[1]));
        Thread secThread = new Thread(new CronometerThread(timeElements[2]));
        
        if (!secThread.isAlive()) {
            
        }
        
        if (timeElements[2].isEnded()) {
            
        }
        
        
        for (TimeElement timeElement : timeElements) {
            while (!timeElement.isEnded()) {
                timeElement.increment();
            }
            timeElement.reset();
        }
    }

    public TimeElement[] getTimeElements() {
        return timeElements;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        for (TimeElement timeElement : timeElements) {
            cadena += timeElement +":";
        }
        return cadena.substring(0, cadena.length()-2);
    }
}
