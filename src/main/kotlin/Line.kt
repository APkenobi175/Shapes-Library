import kotlin.math.sqrt
import kotlin.math.pow

// can throw exception
class Line @Throws(IllegalArgumentException::class) constructor(p1: Point, p2: Point): Shape {
    private val p1: Point = p1.clone() // Strongly Encapsulated turn points into clones
    private val p2: Point = p2.clone()

    init{
        require(p1.getX() != p2.getX() || p1.getY() != p2.getY()) {
            "P1 and P2 cannot be equal, line must not have a length of zero"
        }
    }


    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()

    // Return slope of line
    fun computeSlope(): Double {
        val dx = p2.getX() - p1.getX()
        if (dx == 0.0) return Double.POSITIVE_INFINITY
        return (p2.getY() - p1.getY()) / dx
    }
    // Return length of line
    fun computeLen(): Double = sqrt((p2.getX() - p1.getX()).pow(2.0) + (p2.getY() - p1.getY()).pow(2.0))

    // Use point's move method on each point
    override fun move(dx: Double, dy: Double): Unit {
        p1.move(dx, dy)
        p2.move(dx, dy)
    }

}