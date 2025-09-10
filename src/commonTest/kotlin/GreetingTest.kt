import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class GreetingTest {

    @Test
    fun testExample() {
        val greeting = Greeting()
        assertTrue(greeting.greet().contains("Hello"))
    }
    
    @Test
    fun testCalculation() {
        val greeting = Greeting()
        assertEquals(8, greeting.calculate(5, 3))
    }
    
    @Test
    fun testMessage() {
        val greeting = Greeting()
        val message = greeting.createMessage("Test")
        assertTrue(message.contains("Привет, Test!"))
    }
}