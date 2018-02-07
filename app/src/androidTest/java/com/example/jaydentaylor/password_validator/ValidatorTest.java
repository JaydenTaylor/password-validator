package com.example.jaydentaylor.password_validator;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;



import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jaydentaylor on 2018-02-04.
 */
@RunWith(AndroidJUnit4.class)
public class ValidatorTest {

    @Rule
    public ActivityTestRule<Validator> mActivityRule =
            new ActivityTestRule(Validator.class);

    @Test
    public void UITestPass() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("helloT223"));
        onView(withId(R.id.button)).perform(click());
        onView(withText("Secure!")).check(matches(isDisplayed()));
    }

    @Test
    public void UITestFail() throws Exception {
        onView(withId(R.id.button)).perform(click());
        onView(withText("Not Secure!")).check(matches(isDisplayed()));
    }
}
