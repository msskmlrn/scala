object Tester extends App {
	val masa = new Opiskelija("Matti Mainio", 7, 36)

	println(masa.kokonaisPisteet)  // 43

	val kurssi = new  ToteutettuOpiskelijaJoukko

	val jusa = new Opiskelija("Jussi Juonio", 2, 18)
	kurssi.vie(masa)
	kurssi vie jusa
	kurssi vie new Opiskelija("Saku Sammakko", 19, 23)

	println(kurssi) // Set(Saku Sammakko: 42, Matti Mainio: 43, Jussi Juonio: 20)

	kurssi poista jusa

	println(kurssi) // Set(Saku Sammakko: 42, Matti Mainio: 43)

	val p = new ToteutettuOpiskelijaJoukko with Koeleikkuri
	p vie new Opiskelija("Saku Sammakko", 19, 23)
	p vie new Opiskelija("Matti M", 2, 13)
	println(p) //Set(Saku Sammakko: 42)
		
	val h = new ToteutettuOpiskelijaJoukko with Hyvaksytyt
	h vie new Opiskelija("Saku Sammakko", 19, 23)
	h vie new Opiskelija("Matti M", 2, 13)
	println(h) //Set(Saku Sammakko: 42)
	
	val v = new ToteutettuOpiskelijaJoukko with Koeleikkuri with OnnilleViisPlus
	v.vie(new Opiskelija("Monni", 10, 25))
	v.vie(new Opiskelija("Matti", 10, 25))
	v.vie(new Opiskelija("Monni2", 29, 20))
	println(v) //Set(Monni2: 54, Monni: 40, Matti: 35)
	//Monni2 pääsee läpi, sillä ensin koepisteitä korotetaan viidellä, ja sitten vasta katsotaan
	//koeleikkuria
	
	val v2 = new ToteutettuOpiskelijaJoukko with OnnilleViisPlus with Koeleikkuri
	v2.vie(new Opiskelija("Monni", 10, 25))
	v2.vie(new Opiskelija("Matti", 10, 25))
	v2.vie(new Opiskelija("Monni2", 29, 10))
	println(v2) //Set(Matti: 35, Monni: 40)
	//Nyt Monni2 ei pääse läpi, sillä koeleikkuria sovelletaan ensin
	
	val w = new ToteutettuOpiskelijaJoukko with Koeleikkuri with Hyvaksytyt
	w.vie(new Opiskelija("Matti", 29, 1))
	println(w) //Set()
	
	val e = new ToteutettuOpiskelijaJoukko with Hyvaksytyt with Koeleikkuri
	e.vie(new Opiskelija("Matti", 29, 1))
	println(e) //Set()
}