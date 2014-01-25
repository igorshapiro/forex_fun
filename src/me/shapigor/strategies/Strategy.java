package me.shapigor.strategies;

/**
 * Created by igor on 1/26/14.
 */
public abstract class Strategy {
    protected Runtime runtime;

    protected Strategy(Runtime runtime) {
        this.runtime = runtime;
    }

    abstract void act(int currentValue);
}
