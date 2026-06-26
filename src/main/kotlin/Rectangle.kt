import kotlin.math.abs

class Rectangle @Throws(IllegalArgumentException::class)
constructor(p1: Point, p2: Point): Shape, HasArea {

    // Encapsulation
    private val p1: Point = p1.clone()
    private val p2: Point = p2.clone()

    init{
        require(p1.getX() != p2.getX() && p1.getY() != p2.getY()){
            "Rectangle cannot have zero width or height"
        }
    }

    // Getters Strongly Encapsulated
    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()

    override fun computeArea(): Double = (abs(p2.getX() - p1.getX())) * (abs(p2.getY() - p1.getY()))

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy)
        p2.move(dx, dy)
    }








}