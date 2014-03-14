object LeapYear extends App {

	println("Anna vuosi 1: ");
	val year1 = readInt
	println("Anna vuosi 2: ");
	val year2 = readInt

	val direction = if (year1 < year2) 1 else -1
	
	for (i <- year1 to year2 by direction) {
	    if (isLeapYear(i)) println(i)
	}
	
	def isLeapYear(year: Int) = {
	    (year % 4 == 0) && (year % 100 != 0) || 
		    (year % 400 == 0) && (year % 4000 != 0)
	}
}