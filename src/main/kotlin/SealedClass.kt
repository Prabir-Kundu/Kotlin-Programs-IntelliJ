sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Rectangle(val width: Double, val height: Double) : Shape()
    class Triangle(val side1: Double, val side2: Double, val side3: Double) : Shape()
}

fun getArea(shape: Shape): Double {
    return when (shape) {
        is Shape.Circle -> Math.PI * shape.radius * shape.radius
        is Shape.Rectangle -> shape.width * shape.height
        is Shape.Triangle -> {
            val s = (shape.side1 + shape.side2 + shape.side3) / 2.0
            Math.sqrt(s * (s - shape.side1) * (s - shape.side2) * (s - shape.side3))
        }
    }
}

fun main() {
    val circle = Shape.Circle(5.0)
    val rectangle = Shape.Rectangle(3.0, 4.0)
    val triangle = Shape.Triangle(3.0, 4.0, 5.0)

    val circleArea = getArea(circle)
    val rectangleArea = getArea(rectangle)
    val triangleArea = getArea(triangle)

    println("Circle Area: $circleArea")
    println("Rectangle Area: $rectangleArea")
    println("Triangle Area: $triangleArea")
}
