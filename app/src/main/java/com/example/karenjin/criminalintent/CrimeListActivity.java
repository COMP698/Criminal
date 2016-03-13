package com.example.karenjin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by karenjin on 3/9/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
