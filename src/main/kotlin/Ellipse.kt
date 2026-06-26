import kotlin.math.PI

open class Ellipse @Throws(IllegalArgumentException::class)
constructor(center: Point, private val radiusX: Double, private val radiusY: Double): Shape, HasArea {

    private var center: Point = center.clone()

    init{
        require(radiusX > 0 && radiusY > 0){
            "Cannot have an area of zero (Radii must be positive)"
        }
    }

    // Getters
    fun getCenter(): Point = center.clone()
    fun getRadiusX(): Double = radiusX
    fun getRadiusY(): Double = radiusY

    override fun computeArea(): Double = PI * radiusX * radiusY

    override fun move(dx: Double, dy: Double){
        center.move(dx, dy)
    }


}