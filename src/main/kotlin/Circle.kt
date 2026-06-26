class Circle @Throws(IllegalArgumentException::class)
constructor(center: Point, private val radiusX: Double, private val radiusY: Double): Ellipse(center, radiusX, radiusY) {

    init{
        require(radiusX == radiusY && radiusY > 0 && radiusX > 0){
            "A circle must have equal X and Y Radii"
        }
    }






}