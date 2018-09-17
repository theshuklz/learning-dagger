package dagger;

import javax.inject.Inject;

public class BulbFactory {
    @Inject Bulb bulb;

    public Bulb getBulb() {
        return bulb;
    }
}
