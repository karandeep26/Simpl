package m.com.simpl

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("m.com.simpl", appContext.packageName)
    }

    @Test
    fun changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.edit_text_amount))
            .perform(typeText("123"))
        onView(withId(R.id.edit_text_amount))
            .check(matches(withText("12")))
        selectRadioButton()

        onView(withId(R.id.button_pay_bill)).perform(click())
        // Check that the text was changed.

    }

    fun selectRadioButton() {
        onView(withId(R.id.radio_button_upi)).perform(click())
        onView(withId(R.id.radio_button_upi)).check(matches(isChecked()))
    }


}
