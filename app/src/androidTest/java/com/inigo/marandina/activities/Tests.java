package com.inigo.marandina.activities;

/**
 * Created by inigo on 29/10/17.
 */

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Tests {
    @Rule
    public ActivityTestRule<PlayerActivity> mActivityRule =
            new ActivityTestRule<>(PlayerActivity.class, true, false);

    @Test
    public void testStartMainActivity() {
        // inject User instance here
        mActivityRule.launchActivity(null);
    }
}
