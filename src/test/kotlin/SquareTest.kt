import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFailsWith

@DisplayName("Square Class Tests")
class SquareTest{

    @Test
    @DisplayName("Valid Square (Equal Sides) Successfully Builds")
    fun testValidSquare(){
        val square = Square(Point(1.0, 1.0), Point(5.0, 5.0))
    }

    @Test
    @DisplayName("Invalid Square (Not Equal Sides) Throws Exception")
    fun testInvalidSquare(){
        assertFailsWith<IllegalArgumentException>{
            val square = Square(Point(1.0, 1.0), Point(4.0, 5.0))
        }
    }

}