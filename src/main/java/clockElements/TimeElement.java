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
public abstract class TimeElement implements Timed{
    private final int start;
    protected int end;
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
    
    @Override
    public void increment() {
        if (!isEnded()) {
            value += Timed.step;
        }
    }

    @Override
    public void decrement() {
        if (!isEnded()) {
            value -= Timed.step;
        }
    }

    @Override
    public void reset() {
        ended = false;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
    
    public void setEnd(int end) {
        this.end = end;
    }
    
}
