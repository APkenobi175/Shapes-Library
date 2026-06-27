import kotlin.test.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith


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

    @Test
    @DisplayName("Test Zero Radius Throws Exception")
    fun testZeroRadius() {
        assertFailsWith<IllegalArgumentException> {
            val circle = Circle(Point(1.0, 1.0), 0.0, 0.0)
        }
    }
}