import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith

@DisplayName("Line Class Tests")
class LineTest{

    @Test
    @DisplayName("Test Point 1 Getter")
    fun testGetP1(){
        val line = Line(Point(1.0, 4.0), Point(3.0, 5.0))
        val p1 = line.getP1()

        assertEquals(1.0, p1.getX())
        assertEquals(4.0, p1.getY())
    }

    @Test
    @DisplayName("Test Point 2 Getter")
    fun testGetP2(){
        val line = Line(Point(1.0, 4.0), Point(3.0, 5.0))
        val p2 = line.getP2()

        assertEquals(3.0, p2.getX())
        assertEquals(5.0, p2.getY())
    }

    @Test
    @DisplayName("Test Get Point 1 and 2 Is Strongly Encapsulated")
    fun testGetPointOneAndTwoIsStronglyEncapsulated() {
        val line = Line(Point(1.0, 4.0), Point(3.0, 5.0))
        val p1Moved = line.getP1()
        p1Moved.move(1.0, 1.0)

        val p1NotMoved = line.getP1()
        assertEquals(1.0, p1NotMoved.getX())
        assertEquals(4.0, p1NotMoved.getY())

        val p2Moved = line.getP2()
        p2Moved.move(2.0, 2.0)
        val p2NotMoved = line.getP2()
        assertEquals(3.0, p2NotMoved.getX())
        assertEquals(5.0, p2NotMoved.getY())
    }

    @Test
    @DisplayName("Test Compute Slope Positive")
    fun testComputeSlope(){
        val line = Line(Point(1.0, 4.0), Point(3.0, 5.0))
        val slope = line.computeSlope()

        assertEquals(0.5, slope)
    }

    @Test
    @DisplayName("Test Compute Slope Negative")
    fun testComputeSlopeNegative(){
        val line = Line(Point(1.0, 4.0), Point(3.0, 2.0))
        val slope = line.computeSlope()
        assertEquals(-1.0, slope)
    }

    @Test
    @DisplayName("Test Compute Length")
    fun testComputeLength(){
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, line.computeLen())
    }

    @Test
    @DisplayName("Test Move Positive Direction")
    fun testMove() {
        val line = Line(Point(3.0, 5.0), Point(1.0, 1.0))
        line.move(3.0, 4.0)
        val p1 = line.getP1()
        val p2 = line.getP2()
        assertEquals(6.0, p1.getX())
        assertEquals(4.0, p2.getX())
        assertEquals(9.0, p1.getY())
        assertEquals(5.0, p2.getY())
    }
    @Test
    @DisplayName("Test Move Negative Direction")
    fun testMoveNegative() {
        val line = Line(Point(3.0, -5.0), Point(1.0, -1.0))
        line.move(-2.0, 4.0)
        val p1 = line.getP1()
        val p2 = line.getP2()
        assertEquals(1.0, p1.getX())
        assertEquals(-1.0, p2.getX())
        assertEquals(-1.0, p1.getY())
        assertEquals(3.0, p2.getY())
    }

    @Test
    @DisplayName("Test that 0 length line throws exception")
    fun testZeroLengthThrows(){
        assertFailsWith<IllegalArgumentException>{
            Line(Point(2.0, 2.0), Point(2.0, 2.0))
        }
    }



}