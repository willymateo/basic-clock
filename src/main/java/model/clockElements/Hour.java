/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clockElements;

/**
 *
 * @author Willy Mateo
 */
public class Hour extends TimeElement{

    public Hour() {
        super();
        initializeEnd();
    }
    
    @Override
    public void initializeEnd() {
        this.setEnd(24);
    }
}
