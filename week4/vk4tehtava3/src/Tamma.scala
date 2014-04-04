class Tamma(nimi:String, p: Double) extends Hevonen(nimi, p) with Lypsava {
  
  override def lypsa = {
		val maara = 1.23 * nimi.length; // vähemmän maitoa kuin lehmältä 
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