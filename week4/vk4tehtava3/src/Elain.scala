abstract class Elain (private var nimi:String, private var paino:Double) {
  require(paino > 0)
  
  val aineenvaihduntaKerroin = 0.5
  
  def getPaino = paino
  
  def setPaino(v: Double) {
	  if (v > 0) {
		  paino = v
	  }
  }
  
  def syo(maara: Double) {
	  paino += (aineenvaihduntaKerroin * maara)
  }
  
  def ulosta(maara: Double) {
	  paino -= maara
	  if (paino < 0) paino = 0
  }
    
  def aantele: Unit              // abstrakti metodi
  override def toString = nimi  // korvattaessa "override" pakollinen!
}