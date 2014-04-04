trait Lypsava {
  	def lypsa: Double
	val id = Lypsava.seuraavaId
}

object Lypsava {
	private var id = 0
	def seuraavaId = {
		id += 1;
		id
	}
}