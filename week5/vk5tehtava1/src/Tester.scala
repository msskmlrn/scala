object Tester extends App {
	val pm = new Kuka("Putin")
	pm.reunusta                    // *Putin*
	pm.nimi = "Obama"
	pm.reunusta                    // *Obama*

	val se = new Luku(42)
	se.reunusta           // * 84 *
	se.arvo = 93
	se.reunusta           // ] 186 ]
	se.arvo = -3301
	se.reunusta           // å -6602 å
	
	val t1 = new Kuka("test1")
	t1.alleviivaa
	
	println("tyhjää")
	
	val t2 = new Kuka("test2")
	t2.ylleviivaa
	
	println("tyhjää")
	
	t2.ymparoi
	
	val t3 = new Esine(255)
	t3.reunusta
	
	println("tyhjää")
	t3.ymparoi
}