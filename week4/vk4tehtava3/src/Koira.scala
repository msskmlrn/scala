class Koira(nimi:String, p: Double) extends Elain(nimi, p) with Peto {
  override def aantele {println("Vuh")}
  override def toString = super.toString + ", " + getPaino
}