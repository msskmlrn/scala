class Juustotuotanto (private val tuotantoelain:Lypsava, private var ravinto: Double) {
	def getRavinto = ravinto
	def setRavinto(r: Double) {
		this.ravinto = r
	}
	def getLypsava = tuotantoelain
	
	def teeJuustoa: Double = {
		val maitoa = tuotantoelain.lypsa
		val juustoa = 0.5 * maitoa
		juustoa
	}
}