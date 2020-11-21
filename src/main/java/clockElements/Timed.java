/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockElements;

/**
 *
 * @author Willy Mateo
 */
public interface Timed {
    
    final int step = 1;
    
    void increment();
    
    void decrement();
    
    void reset();
}
