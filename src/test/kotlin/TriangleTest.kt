import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith

@DisplayName("Triangle Class Tests")
class TriangleTest {
    @Test
    @DisplayName("Triangle with all points on same line throws Exception")
    fun testInvalidTriangle(){
        assertFailsWith<IllegalArgumentException>{
            val triangle = Triangle(Point(1.0, 1.0), Point(1.0, 1.0), Point(1.0, 1.0))
        }
    }

    @Test
    @DisplayName("Test Point 1 Getter")
    fun testGetP1(){
        val triangle = Triangle(Point(1.0, 4.0), Point(3.0, 5.0), Point(12.0, 14.0))
        val p1 = triangle.getP1()

        assertEquals(1.0, p1.getX())
        assertEquals(4.0, p1.getY())
    }

    @Test
    @DisplayName("Test Point 2 Getter")
    fun testGetP2(){
        val triangle = Triangle(Point(1.0, 4.0), Point(3.0, 5.0), Point(12.0, 14.0))
        val p2 = triangle.getP2()

        assertEquals(3.0, p2.getX())
        assertEquals(5.0, p2.getY())
    }
    @Test
    @DisplayName("Test Point 3 Getter")
    fun testGetP3(){
        val triangle = Triangle(Point(1.0, 4.0), Point(3.0, 5.0), Point(12.0, 14.0))
        val p3 = triangle.getP3()

        assertEquals(12.0, p3.getX())
        assertEquals(14.0, p3.getY())
    }

    @Test
    @DisplayName("Test Get Point 1 and 2 and 3 are Strongly Encapsulated")
    fun testGetPointOneAndTwoIsStronglyEncapsulated() {
        val triangle = Triangle(Point(1.0, 4.0), Point(3.0, 5.0), Point(12.0, 14.0))
        val p1Moved = triangle.getP1()
        p1Moved.move(1.0, 1.0)

        val p1NotMoved = triangle.getP1()
        assertEquals(1.0, p1NotMoved.getX())
        assertEquals(4.0, p1NotMoved.getY())

        val p2Moved = triangle.getP2()
        p2Moved.move(2.0, 2.0)
        val p2NotMoved = triangle.getP2()
        assertEquals(3.0, p2NotMoved.getX())
        assertEquals(5.0, p2NotMoved.getY())

        val p3Moved = triangle.getP3()
        p3Moved.move(2.0, 2.0)
        val p3NotMoved = triangle.getP3()
        assertEquals(12.0, p3NotMoved.getX())
        assertEquals(14.0, p3NotMoved.getY())
    }

    @Test
    @DisplayName("Test Area Computation")
    fun testComputeArea(){
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertEquals(6.0, triangle.computeArea())
    }

    @Test
    @DisplayName("Test Move Positive Direction")
    fun testMove() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        triangle.move(3.0, 4.0)
        val p1 = triangle.getP1()
        val p2 = triangle.getP2()
        val p3 = triangle.getP3()
        assertEquals(3.0, p1.getX())
        assertEquals(4.0, p1.getY())
        assertEquals(7.0, p2.getX())
        assertEquals(4.0, p2.getY())
        assertEquals(3.0, p3.getX())
        assertEquals(7.0, p3.getY())
    }
    @Test
    @DisplayName("Test Move Negative Direction")
    fun testMoveNegative() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        triangle.move(-2.0, 4.0)
        val p1 = triangle.getP1()
        val p2 = triangle.getP2()
        val p3 = triangle.getP3()
        assertEquals(-2.0, p1.getX())
        assertEquals(4.0, p1.getY())
        assertEquals(2.0, p2.getX())
        assertEquals(4.0, p2.getY())
        assertEquals(-2.0, p3.getX())
        assertEquals(7.0, p3.getY())
    }
}