object SecondProgram extends App {
	
	val counter = new SecondCounter
	println(counter)
	
	for (i <- 1 to 70) {
		counter.lisaaSekunti
		println(counter)
	}
	
	for (i <- 1 to 86329)
		counter.lisaaSekunti
	
	println(counter)
	counter.lisaaSekunti
	println(counter)
	counter.lisaaSekunti
	println(counter)
	
	println(counter.getSekunnit)
	println(counter.getMinuutit)
	println(counter.getTunnit)
	
	println("uusi laskuri\n")
	
	val counter2 = SecondCounter() 
	println(counter2)
	for (i <- 1 to 10) {
		counter2.lisaaSekunti
		println(counter2)
	}
}