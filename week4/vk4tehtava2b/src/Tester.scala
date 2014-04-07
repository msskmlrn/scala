object Tester extends App {
	var tallenne = new Tallenne(232, "Laa, laa, laulukappale")
	var tallenne2 = new Tallenne(120, "Soo, soo soittojuttu")
	var tallenne3 = new Tallenne(120, "Kissanviikset pakkasessa huurtuu")
	
	println(tallenne)
	println(tallenne2)
	println(tallenne3)
	
	var taltio = new Taltio
	println("tyhjä taltio")
	println(taltio)
	
	taltio.lisaa(tallenne)
	println("yksi lisätty taltio")
	println(taltio)
	
	taltio.lisaa(tallenne2)
	println("kaksi lisättyä taltiota")
	println(taltio)
	
	taltio.lisaa(tallenne3)
	println("kolme lisättyä taltiota")
	println(taltio)
	
	taltio.poista(tallenne)
	
	println("poistettu taltio")
	println(taltio)
}
