package com.example.gp19s2;

import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertNotNull;
@RunWith(AndroidJUnit4.class)
public class calendarTest {
    private Calendar medit=null;
    @Rule
    public IntentsTestRule<Calendar> activityRule
            = new IntentsTestRule<>(Calendar.class);

    @Before
    public void setUp() throws Exception {
        medit=activityRule.getActivity();
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void launchTest() {
        View view=medit.findViewById(R.id.compactcalendar_view);
        assertNotNull(view);
    }
    @Test
    public void intentTest(){
        Espresso.onView(withId(R.id.navigation_home)).perform(click());
        intended(hasComponent(List.class.getName()));
    }
}
