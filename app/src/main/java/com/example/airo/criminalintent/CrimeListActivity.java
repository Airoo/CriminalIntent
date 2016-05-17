package com.example.airo.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Airo on 04.05.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
