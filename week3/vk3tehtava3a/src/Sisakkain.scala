object Sisakkain extends App {
  val a=1; val b=2; val c=3
  def f = {
    val b=20; val c=30 //peitetään vanhat b ja c näkyvistä nimeämällä parametrit samoilla nimillä
    def ff = {
      val c=300 //peitetään vanha f:n alun c näkyvistä
      println(a+"/"+b+"/"+c) //kolmas tulostus: f:n alussa määritelty c peitetään uudella saman
      //nimisellä parametrilla
      //eli a=1, b=20, c=300
    }
    println(a+"/"+b+"/"+c) //toinen tulostus: a:n arvo on edelleen sama, mutta vanhat b ja c peitetään
    //näkyvistä nimeämällä uudet saman nimiset parametrit ja antamalla niille arvot f:n alussa
    //eli a=1, b=20, c=30
    ff //funktion ff kutsu
  }
  def g = {
    def gg = {
      f //kutsutaan f:ää
      60 //palautetaan 60
    }
    val a=40; val b=gg; //peitetään vanha a j b, kutsutaan gg:tä ja asetetaan palautuva 60 b:n arvoksi
    //eli a=40, b=60, c=3
    println(a+"/"+b+"/"+c)
    f //kutsutaan taas f:ää
  }
  println(a+"/"+b+"/"+c) //ensimmäinen tulostus: parametrien arvot on määritelty alussa
  //eli a=1, b=2, c=3
  f; //funktion f kutsu
  { val a=1000 //peitetään vanha a näkyvistä
    g //funktion g kutsu
    //eli a=1000, b=2, c=3
    println(a+"/"+b+"/"+c)
  }
}