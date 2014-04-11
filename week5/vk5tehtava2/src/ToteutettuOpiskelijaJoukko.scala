class ToteutettuOpiskelijaJoukko extends OpiskelijaJoukko {
	import scala.collection.mutable.HashSet

	private val joukko = new HashSet[Opiskelija]
	
	def vie(x: Opiskelija) {joukko += x}
	def poista(x: Opiskelija) {joukko -= x}
	override def toString = joukko.toString
}