class Lehma(nimi:String, p:Double) extends Nauta(nimi, p) with Lypsava {
	override def lypsa = {
		val maara = 3.14 * nimi.length; // maidon määrä riippuu nimen pituudesta... 
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