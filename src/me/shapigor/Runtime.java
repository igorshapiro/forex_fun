package me.shapigor;

/**
 * Created by igor on 1/26/14.
 */
public class Runtime<TRateProvider, TStrategy> implements IRuntime {
    private final TRateProvider provider;
    private final TStrategy strategy;

    public Runtime(TRateProvider provider, TStrategy strategy) {
        this.provider = provider;
        this.strategy = strategy;
    }

    public void run() {

    }
}
