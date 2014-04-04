class Kuttu (nimi:String, p: Double) extends Vuohi(nimi, p) with Lypsava {
	override def lypsa = {
		val maara = 0.7 * nimi.length; // maidon määrä riippuu nimen pituudesta... 
		if ((getPaino - maara) > 0) {
			setPaino(getPaino - maara)
		}
		
		if (maara > getPaino) {
			0.0
		}
		else {
			maara
		}
	}
	
	override def toString = super.toString + ", " + getPaino + ", id " + id
}