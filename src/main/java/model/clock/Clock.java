/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clock;

/**
 *
 * @author Willy Mateo
 */
public class Clock {
    private HourFormat format;

    public void work(){
        
    }
    
    @Override
    public String toString() {
        return format.toString();
    }
    
}
