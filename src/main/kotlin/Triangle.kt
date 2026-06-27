import kotlin.math.abs

class Triangle @Throws(IllegalArgumentException::class)
constructor(p1: Point, p2: Point, p3: Point): Shape, HasArea {
    private var p1: Point = p1.clone()
    private var p2: Point = p2.clone()
    private var p3: Point = p3.clone()


    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()
    fun getP3(): Point = p3.clone()

    init{
        require(computeArea() > 0) {
            "Triangles cannot have all 3 points on the same line" }
    }



    override fun computeArea(): Double{
        val x1 = p1.getX()
        val y1 = p1.getY()
        val x2 = p2.getX()
        val y2 = p2.getY()
        val x3 = p3.getX()
        val y3 = p3.getY()
        return abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0
    }

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy)
        p2.move(dx, dy)
        p3.move(dx, dy)
    }
}