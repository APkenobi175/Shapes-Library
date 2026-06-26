import kotlin.test.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals
import kotlin.math.PI

@DisplayName("Ellipse Class Tests")
class EllipseTest {

    @Test
    @DisplayName("Test Zero for X Radius Throws Exception")
    fun testZeroRadiusX() {
        assertFailsWith<IllegalArgumentException> {
            val ellipse = Ellipse(Point(1.0, 1.0), 0.0, 5.0)
        }
    }


    @Test
    @DisplayName("Test Zero for Y Radius Throws Exception")
    fun testZeroRadiusY() {
        assertFailsWith<IllegalArgumentException> {
            val ellipse = Ellipse(Point(1.0, 1.0), 5.0, 0.0)
        }
    }

    @Test
    @DisplayName("Test Center Point Getter")
    fun testGetCenter() {
        val ellipse = Ellipse(Point(1.0, 2.0), 5.0, 5.0)
        val center = ellipse.getCenter()
        assertEquals(1.0, center.getX())
        assertEquals(2.0, center.getY())
    }

    @Test
    @DisplayName("Test RadiusX Getter")
    fun testRadiusX() {
        val ellipse = Ellipse(Point(1.0, 1.0), 5.0, 6.0)
        val radiusX = ellipse.getRadiusX()
        assertEquals(5.0, radiusX)
    }

    @Test
    @DisplayName("Test RadiusY Getter")
    fun testRadiusY() {
        val ellipse = Ellipse(Point(1.0, 1.0), 6.0, 5.0)
        val radiusY = ellipse.getRadiusY()
        assertEquals(5.0, radiusY)
    }

    @Test
    @DisplayName("Test Center Point is Strongly Encapsulated")
    fun testCenterIsStronglyEncapsulated() {
        val ellipse = Ellipse(Point(1.0, 2.0), 5.0, 6.0)
        val centerMoved = ellipse.getCenter()
        centerMoved.move(1.0, 2.0)
        assertEquals(1.0, ellipse.getCenter().getX())
        assertEquals(2.0, ellipse.getCenter().getY())

    }

    @Test
    @DisplayName("Test Area Computation")
    fun testComputeArea() {
        val ellipse = Ellipse(Point(1.0, 1.0), 5.0, 6.0)
        val area = ellipse.computeArea()
        // Account for floating point errors
        assertEquals(PI * 5.0 * 6.0, area)
    }

    @Test
    @DisplayName("Test Move Positive Direction")
    fun testMove() {
        val ellipse = Ellipse(Point(5.0, 5.0), 5.0, 6.0)
        ellipse.move(3.0, 4.0)
        val point = ellipse.getCenter()
        assertEquals(8.0, point.getX())
        assertEquals(9.0, point.getY())
    }
    @Test
    @DisplayName("Test Move Negative Direction")
    fun testMoveNegative() {
        val ellipse = Ellipse(Point(3.0, -5.0), 5.0, 6.0)
        ellipse.move(-2.0, -4.0)
        val point = ellipse.getCenter()
        assertEquals(1.0, point.getX())
        assertEquals(-9.0, point.getY())
    }
}

