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
public abstract class TimeElement implements Timed{
    private final int start;
    private int end;
    private int value;
    private boolean ended;

    public TimeElement() {
        start = 0;
        value = 0;
    }

    public boolean isEnded(){
        return ended;
    }

    public int getValue() {
        return value;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    public abstract void initializeEnd();
    
    @Override
    public void increment() {
        if (!isEnded()) {
            value += Timed.step;
            if (value == end) {
                ended = true;
            }
        }
    }

    @Override
    public void decrement() {
        if (!isEnded()) {
            value -= Timed.step;
            if (value == end) {
                ended = true;
            }
        }
    }

    @Override
    public void reset() {
        value = start;
        ended = false;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
    
}
