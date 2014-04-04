class Kissa(nimi:String, naukumistiheys:Int, p: Double) extends Elain(nimi, p) with Peto {
  override def aantele {println("Miau")}
  override def toString = super.toString + "-" + naukumistiheys + "-" + getPaino
}