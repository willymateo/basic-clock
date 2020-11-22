/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.threads;

import model.clock.HourFormat;
import model.clockElements.TimeElement;

/**
 *
 * @author Willy Mateo
 */
public class CronometerThread implements Runnable{

    private HourFormat hf;
    TimeElement timeElement;

    public CronometerThread(TimeElement timeElement) {
        this.timeElement = timeElement;
    }
    
    @Override
    public void run() {
        try {
            int i = 0;
        if (0 < hf.getTimeElements().length) {
            while (i < hf.getTimeElements().length) {
                hf.getTimeElements()[i].increment();
                if (hf.getTimeElements()[i].isEnded()) {
                    hf.getTimeElements()[i].reset();
                    i++;
                } else {
                    Thread.sleep(1000);
                }
            }
        }
            
        } catch (InterruptedException ex) {
            System.out.println("Algo inesperado sucedió:" +ex);
        }
    }
    
}
