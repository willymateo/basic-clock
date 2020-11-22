/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.threads;

import model.clockElements.TimeElement;

/**
 *
 * @author Willy Mateo
 */
public class CronometerThread implements Runnable{

    TimeElement timeElement;

    public CronometerThread(TimeElement timeElement) {
        this.timeElement = timeElement;
    }
    
    @Override
    public void run() {
        try {
            if (!timeElement.isEnded()) {
                timeElement.increment();
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Algo inesperado sucedió:" +ex);
        }
    }
    
}
