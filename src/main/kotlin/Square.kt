import kotlin.math.abs

class Square @Throws(IllegalArgumentException::class)
constructor(p1: Point, p2: Point): Rectangle(p1, p2){
    init{
        val width = abs(p2.getX() - p1.getX())
        val height = abs(p2.getY() - p1.getY())
        require(width == height){
            "Square must have equal width and height"
        }
    }
}