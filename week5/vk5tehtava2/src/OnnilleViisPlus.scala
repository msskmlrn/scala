trait OnnilleViisPlus extends OpiskelijaJoukko {
	abstract override def vie(opiskelija: Opiskelija) = {
		if (opiskelija.nimi.contains("onni") || opiskelija.nimi.contains("Onni")) {
			opiskelija.koePisteet += 5
			super.vie(opiskelija)
		}
		else {
			super.vie(opiskelija)
		}
	}
}