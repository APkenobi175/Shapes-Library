
import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertNotSame

@DisplayName("Point Class Tests")
class PointTest {

    @Test
    @DisplayName("Test X and Y Coordinate Getter")
    fun testGetters() {
        val point = Point(3.0, 5.0)
        assertEquals(3.0, point.getX())
        assertEquals(5.0, point.getY())
    }

    @Test
    @DisplayName("Test Clone Method Has Same Properties")
    fun testClone() {
        val point = Point(3.0, 5.0)
        val pointClone = point.clone()
        assertEquals(point.getX(), pointClone.getX())
        assertEquals(point.getY(), pointClone.getY())
    }

    @Test
    @DisplayName("Test Cloned Object Is Not Same Object In Memory")
    fun testCloneNotSameObject() {
        val point = Point(3.0, 5.0)
        val pointClone = point.clone()
        assertNotSame(point, pointClone)
    }

    @Test
    @DisplayName("Test Move Positive Direction")
    fun testMove() {
        val point = Point(3.0, 5.0)
        point.move(3.0, 4.0)
        assertEquals(6.0, point.getX())
        assertEquals(9.0, point.getY())
    }
    @Test
    @DisplayName("Test Move Negative Direction")
    fun testMoveNegative() {
        val point = Point(3.0, -5.0)
        point.move(-2.0, 4.0)
        assertEquals(1.0, point.getX())
        assertEquals(-1.0, point.getY())
    }
}