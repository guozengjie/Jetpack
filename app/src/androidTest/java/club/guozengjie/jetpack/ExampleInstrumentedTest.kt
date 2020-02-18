package club.guozengjie.jetpack

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.Timeout
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var activity: MainActivity

    @get:Rule
    var mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    //在Test前初始化
    @Before
    fun init() {
        mActivityRule.scenario.onActivity {
            activity = it
        }
    }
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("club.guozengjie.jetpack", appContext.packageName)
    }
    @Test
    fun useA() {
        val btn = Espresso.onView(ViewMatchers.withId(R.id.btn))
        println("-------------------$btn")
        //验证更新按钮是否显示
        btn.check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        //点击更新按钮
        btn.perform(ViewActions.click())
    }
}
