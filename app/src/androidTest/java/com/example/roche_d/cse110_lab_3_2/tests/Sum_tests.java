package com.example.roche_d.cse110_lab_3_2.tests;

import android.test.ActivityInstrumentationTestCase2;

import com.example.roche_d.cse110_lab_3_2.MainActivity;

/**
 * Created by roche_d on 14/04/16.
 */
public class Sum_tests extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public Sum_tests ()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(1, -1), 0);
    }

    public void test_second()
    {
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(42, 0), 42);
    }

    public void test_third()
    {
        mainActivity = getActivity();
        assertEquals(mainActivity.sum(0, -42), -42);
    }

}
