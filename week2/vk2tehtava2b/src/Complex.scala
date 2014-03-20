class Complex(val x: Double, val y: Double) {
	def + (that: Complex) = Complex(x + that.x, y + that.y)
	def - (that: Complex) = this + -that
	def * (that: Complex) = Complex(x * that.x - y * that.y, x * that.y + that.x * y)
	def / (that: Complex) = this * that.inverse
	def unary_- = Complex(-x, -y)

	private def inverse = Complex((x / (x*x + y*y)), (-y / (x*x + y*y)))

	override def toString = {
		var temp = x
		if (y < 0) temp + "" + y + "i"
		else temp + "+" + y + "i"
	}
}

object Complex {
	def apply(r: Double, i: Double) = new Complex(r, i)
}