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
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SampleFunctionalTest {

    private lateinit var amountToBeEntered: String


    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Specify a valid string.
        amountToBeEntered = "100"
    }

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
            .perform(typeText(amountToBeEntered))
        onView(withId(R.id.edit_text_amount))
            .check(matches(withText(amountToBeEntered)))
        selectRadioButton()

        onView(withId(R.id.button_pay_bill)).perform(click())

    }

    private fun selectRadioButton() {
        onView(withId(R.id.radio_button_upi)).perform(click())
        onView(withId(R.id.radio_button_upi)).check(matches(isChecked()))
        onView(withId(R.id.radio_button_balance)).check(matches(isNotChecked()))
    }


}
