object Kieli {

  def lue = readInt
  
  def kirjoita(arvo: Any) {
	  println(arvo toString)
  }
  
  def jos(ehto: Boolean) (tee: => Unit) {
	  if (ehto) tee
  }
  
  def toista(lkm: Int) (tee: => Unit) {
	  for (i <- 1 to lkm) tee
  }
  
  def toistaEhdolla(ehto: => Boolean) (tee: => Unit) {
	  while (ehto) tee
  }
 
  
  /*
   * Curry-muunnoksia
   * 
   * => eli nimiparametreja, jotka evaluoidaan vasta niiden viitekohdassa
   * arvoparametrit evaluoidaan kutsun yhteydessä, ennen funktion rungon suoritusta
   * arvoparametrien arvot kopioidaan kehykseen
   */
}