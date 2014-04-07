class Taltio {
	private var tallenteet = List[Tallenne]()
	
	def lisaa(tallene: Tallenne) {
		tallenteet = tallenteet.:+(tallene)
	}
	
	def poista(tallenne: Tallenne) {
		tallenteet = tallenteet.filterNot(t => t == tallenne)
	}
	
	override def toString = {
		var kello = new MinSek
		
		var tulostus = ""
		tallenteet.foreach { t => 
			kello.+=(t.getKesto)
			tulostus += kello + " " + t.getNimi + "\n"
		}
		tulostus
	}
}