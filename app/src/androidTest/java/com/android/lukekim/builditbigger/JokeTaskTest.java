package com.android.lukekim.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by lukekim on 10/6/16.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testRetrievingNonEmptyStringFromAsyncTask() {
        onView(withId(R.id.jokeButton))
                .perform(click());
        onView(withId(R.id.text_view))
                .check(matches(not(withText(""))));
    }
}