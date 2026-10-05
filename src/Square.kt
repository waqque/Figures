class Square(var x: Int = 0, var y: Int = 0, var side: Int = 1) : Movable, Figure(0), Transforming {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return (side * side).toFloat()
    }

    override fun resize(zoom: Int) {
        side *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY
        if (direction == RotateDirection.Clockwise) {
            x = centerX + dy
            y = centerY - dx
        } else {
            x = centerX - dy
            y = centerY + dx
        }
    }

    override fun toString(): String {
        return "Square(x=$x, y=$y, side=$side)"
    }
}