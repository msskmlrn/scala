object ComplexTester extends App {
	val a = new Complex(1.1, 3.1)
	val b = new Complex(3.1, -6.1)

	println(a)
	println(b)
	
	println(a+b)
	println(a-b)
	println(a*b)
	println(a/b)

	println(-b)
}
