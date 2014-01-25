package me.shapigor.providers;

import java.util.Random;

/**
 * Created by igor on 1/25/14.
 */
public class RandomRateProvider implements IRateProvider {
    int _current;
    Random _random = new Random();

    public RandomRateProvider() {
        this._current = _random.nextInt(10000);
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    static final int THRESHOLD_3 = 2;
    static final int THRESHOLD_2 = 7;

    @Override
    public Integer next() {
        // We want -3 and 3 to be less frequent than -2 and 2, than -1 and 1
        int rand = _random.nextInt(100);
        if (rand < THRESHOLD_3) return _random.nextInt(7) - 3;    // return [-3..3] in THRESHOLD_3 out of 100 calls
        if (rand < THRESHOLD_3 + THRESHOLD_2) return _random.nextInt(5) - 2;   // return [-2..2] in THRESHOLD_2 out of 100 calls
        return _random.nextInt(3) - 1;                  // return [-1..1] in (100 - THRESHOLD_2 - THRESHOLD_3) out of 100 calls
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can't remove rate");
    }
}
