package me.shapigor.providers;

import org.junit.Test;

/**
 * Created by igor on 1/26/14.
 */
public class RandomRateProviderTest {

    // For manual run
    @Test
    public void ShowSequence() {
        IRateProvider provider = new RandomRateProvider();
        for (int i = 0; i < 1000; i++) {
            System.out.println(provider.next());
        }
    }
}
