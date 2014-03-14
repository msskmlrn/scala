object pyramid extends App {

	println("Kuinka korkea pyramidi piirretään? ");
	val height = readInt
	
	for (level <- 1 to height) {
		val empty = height - level
		val stars = level * 2 - 1
		println(" " * empty + "*" * stars) 

		//def *(n: Int): String
		//Return the current string concatenated n times
	}
}