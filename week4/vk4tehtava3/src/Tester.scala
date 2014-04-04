object Tester extends App {
	val koira = new Koira("Musti", 20)
	var elain: Elain = new Kissa("Missu", 2, 15)
	val kissa = new Kissa("Missu", 2, 15)
	val lehma = new Lehma("Mansikki", 200)
	val kuttu = new Kuttu("Kuttu", 25)
	val tamma = new Tamma("Tamma", 100)
	
	println(koira)
	koira.syo(10)
	println(koira)
	
	println(lehma)
	lehma.syo(10)
	println(lehma)
		
	println(tamma)
	tamma.syo(10)
	println(tamma)
	
	println(koira)
	koira.ulosta(2)
	println(koira)
	
	println(lehma)
	lehma.ulosta(2)
	println(lehma)
	
	koira.aantele
	elain.aantele
	kissa.aantele
	
	elain = new Tamma("t", 100)
	elain.aantele
	
	println(lehma)
	lehma.lypsa
	println(lehma)
	
	println(tamma)
	tamma.lypsa
	println(tamma)
	
	val nauta: Nauta = new Lehma("l", 150)
	nauta.aantele
	lehma.aantele
	
	println(kuttu)
	println(tamma)
	println(lehma)
	
	println
	
	val tehdas = new Juustotuotanto(lehma, 100)
	println(lehma)
	println(tehdas.teeJuustoa)
	println(lehma)
	
	val tehdas2 = new Juustotuotanto(tamma, 100)
	println(tamma)
	println(tehdas2.teeJuustoa)
	println(tamma)
}