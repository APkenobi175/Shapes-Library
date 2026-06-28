class Circle @Throws(IllegalArgumentException::class)
constructor(center: Point, private val radius: Double): Ellipse(center, radius, radius) {

    init{
        require(radius > 0){
            "Cannot have an area of zero (Radius must be positive)"
        }
    }

    fun getRadius():  Double = radius







}