/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import clockElements.TimeElement;

/**
 *
 * @author Willy Mateo
 */
public class HourFormat {
    private final TimeElement[] timeElements;

    public HourFormat(TimeElement[] timeElements) {
        this.timeElements = timeElements;
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
