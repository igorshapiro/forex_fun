package me.shapigor;

import me.shapigor.providers.RandomRateProvider;
import me.shapigor.strategies.MartingaleStrategy;

/**
 * Created by igor on 1/25/14.
 */
public class Program {
    public static void main(String[] args) {
        Runtime simulator = new Runtime(new RandomRateProvider(), new MartingaleStrategy());
        simulator.run();
    }
}
