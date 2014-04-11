class Opiskelija(val nimi: String,
		var harjoitusPisteet: Int,
		var koePisteet: Int
		) {

	def kokonaisPisteet = harjoitusPisteet + koePisteet
	override def toString = nimi + ": " + kokonaisPisteet
}