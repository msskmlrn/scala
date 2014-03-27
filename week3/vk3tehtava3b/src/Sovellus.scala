object Sovellus extends App {

  def harm(i: Int) = 1.0/i
  println("eka "+   Kirjasto.summa(harm, 4) )

  def geom(i: Int) = 1.0/(i*i)
  println("toka "+  Kirjasto.summa(geom, 4) )

  println("kolmas "+  Kirjasto.summa(_ +0.5, 4) )

  var laskuri=0.0
  def mitaMita(i: Int) = {laskuri+=1; laskuri}
  println("neljas "+  Kirjasto.summa(mitaMita, 4) )

  var ed=1; var seur=1; var alussa=1
  def f(i: Int) = if (alussa<3)
                     {alussa+=1; 1}
                  else
                     {val uus=ed+seur; ed=seur; seur=uus; uus}

  println("viides "+  Kirjasto.summa(f, 4) )
}