package com.example.karenjin.criminalintent;

import com.squareup.otto.Bus;

/**
 * Created by karenjin on 3/13/16.
 */


public final class BusProvider {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {
        // No instances.
    }
}