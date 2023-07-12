import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotEquals

class FirstTest {
    @Test
    fun `first test`() {
        assertEquals(1+3, 4)
        assertNotEquals(3-2, 3)
        assertFails { 3/0 }
    }
}