package club.guozengjie.jetpack

import org.junit.*

class MainActivityTest {
    companion object{
        @BeforeClass
        @JvmStatic
        fun start(){
            println("-------start------")
        }
        @AfterClass
        @JvmStatic
        fun end(){
            println("-------end------")
        }
    }
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