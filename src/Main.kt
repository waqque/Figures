fun main() {
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)

    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle()

    println(f.area())
    println(f2.area())

    // проверка перемещения, масштабирования и поворота прямоугольника
    val rect = Rect(0, 0, 4, 2)
    println("Rect: $rect, area: ${rect.area()}")
    rect.move(2, 3)
    rect.resize(2)
    rect.rotate(RotateDirection.Clockwise, 0, 0)
    println("Rect after move, resize, rotate: $rect, area: ${rect.area()}")

    // проверка для круга
    val circle = Circle(1, 1, 3)
    println("Circle: $circle, area: ${circle.area()}")
    circle.move(2, -1)
    circle.resize(2)
    circle.rotate(RotateDirection.CounterClockwise, 0, 0)
    println("Circle after move, resize, rotate: $circle, area: ${circle.area()}")

    // проверка для квадрата
    val square = Square(2, 2, 4)
    println("Square: $square, area: ${square.area()}")
    square.move(-1, 3)
    square.resize(2)
    square.rotate(RotateDirection.Clockwise, 0, 0)
    println("Square after move, resize, rotate: $square, area: ${square.area()}")

    // трансформация фигур в массиве
    val transformables: Array<Transforming> = arrayOf(
        Rect(0, 0, 2, 3),
        Circle(0, 0, 2),
        Square(0, 0, 3)
    )
    for (figure in transformables) {
        figure.resize(2)
        figure.rotate(RotateDirection.Clockwise, 0, 0)
        println(figure)
    }
}