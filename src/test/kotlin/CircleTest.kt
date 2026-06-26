import kotlin.test.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals
import kotlin.math.PI

@DisplayName("Ellipse Class Tests")
class CircleTest {

    @Test
    @DisplayName("Test Unequal X and Y Radii Throw Exception")
    fun testUnequalXAndY(){
        assertFailsWith<IllegalArgumentException>{
            val circle = Circle(Point(1.0, 1.0), 5.0, 6.0)
        }
    }

    @Test
    @DisplayName("Test Valid Circle Successfully Creates")
    fun testValidCircle(){
        val circle = Circle(Point(1.0, 1.0), 6.0, 6.0)
    }
}