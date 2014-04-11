trait Hyvaksytyt extends OpiskelijaJoukko {
	abstract override def vie(opiskelija: Opiskelija) = if (opiskelija.kokonaisPisteet >= 30) super.vie(opiskelija)
}