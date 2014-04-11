class Luku(var arvo: Int) extends KoristellenTulostettava {
    override def koristettava = " " + arvo * 2 + " "
    override def koristemerkki = math.abs(arvo)%256 toChar
}