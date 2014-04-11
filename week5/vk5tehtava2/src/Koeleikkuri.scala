trait Koeleikkuri extends OpiskelijaJoukko {
	abstract override def vie(opiskelija: Opiskelija) = if (opiskelija.koePisteet >= 23) super.vie(opiskelija)
}