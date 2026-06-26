import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith
import kotlin.test.assertNotSame

@DisplayName("Rectangle Class Tests")
class RectangleTest {

    @Test
    @DisplayName("Zero Width Throws Exception")
    fun testZeroWidthThrowsException(){
        assertFailsWith<IllegalArgumentException>{Rectangle(Point(2.0, 1.0), Point(2.0, 5.0))}
    }

    @Test
    @DisplayName("Zero Height Throws Exception")
    fun testZeroHeightThrowsException(){
        assertFailsWith<IllegalArgumentException>{Rectangle(Point(2.0, 1.0), Point(5.0, 1.0))}
    }

    @Test
    @DisplayName("Test Point 1 Getter")
    fun testGetP1(){
        val rectangle = Rectangle(Point(1.0, 4.0), Point(3.0, 5.0))
        val p1 = rectangle.getP1()

        assertEquals(1.0, p1.getX())
        assertEquals(4.0, p1.getY())
    }

    @Test
    @DisplayName("Test Point 2 Getter")
    fun testGetP2(){
        val rectangle = Rectangle(Point(1.0, 4.0), Point(3.0, 5.0))
        val p2 = rectangle.getP2()

        assertEquals(3.0, p2.getX())
        assertEquals(5.0, p2.getY())
    }

    @Test
    @DisplayName("Test Get Point 1 and 2 Is Strongly Encapsulated")
    fun testGetPointOneAndTwoIsStronglyEncapsulated() {
        val rectangle = Rectangle(Point(1.0, 4.0), Point(3.0, 5.0))
        val p1Moved = rectangle.getP1()
        p1Moved.move(1.0, 1.0)

        val p1NotMoved = rectangle.getP1()
        assertEquals(1.0, p1NotMoved.getX())
        assertEquals(4.0, p1NotMoved.getY())

        val p2Moved = rectangle.getP2()
        p2Moved.move(2.0, 2.0)
        val p2NotMoved = rectangle.getP2()
        assertEquals(3.0, p2NotMoved.getX())
        assertEquals(5.0, p2NotMoved.getY())
    }

    @Test
    @DisplayName("Test Area Computation")
    fun testComputeArea(){
        val rectangle = Rectangle(Point(2.0, 1.0), Point(5.0, 5.0))
        assertEquals(12.0, rectangle.computeArea())
    }
}