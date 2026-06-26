class Point(private var x: Double, private var y: Double) : Shape {

    // Getters
    fun getX(): Double = x
    fun getY(): Double = y

    // Return copy of Point with same x and Y coordinates
    fun clone(): Point{
        return Point(x, y)
    }

    // Add X and Y to the new Dx and Dy
    override fun move(dx: Double, dy: Double){
        x += dx
        y += dy
    }
}