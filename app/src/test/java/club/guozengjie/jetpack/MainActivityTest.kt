package club.guozengjie.jetpack

import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
        println("-------Before------")
    }

    @After
    fun tearDown() {
        println("-------tearDown------")
    }

    @Test
    fun message() {
        println("-------message------")
    }

    @Test
    fun error() {
        println("-------error------")
    }

    @Test
    fun onCreate() {
        println("-------onCreate------")
    }
}