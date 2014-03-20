object ListOperations extends App {
	
	val testList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 1)
	println("count example")
	println(testList.count(_ == 1))
	
	println("exists example")
	println(testList.exists(_ == 2))
	println(testList.exists(_ == 10))
	
	println("filter example")
	println(testList.filter(_ % 2 == 0))
	
	println("forall example")
	println(testList.forall(_ < 10))
	println(testList.forall(_ == 1))
	
	println("map example")
	println(testList.map(x => x + 10))	
}