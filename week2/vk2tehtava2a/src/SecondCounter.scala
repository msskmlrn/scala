class SecondCounter {
	private var seconds = 0
	private var minutes = 0
	private var hours = 0
	
	def getSekunnit = seconds
	def getMinuutit = minutes
	def getTunnit = hours
	
	def lisaaSekunti {
		seconds += 1
		if (seconds == 60) {
			seconds = 0
			minutes += 1
			if (minutes == 60) {
				minutes = 0
				hours += 1
				if (hours == 24) {
					hours = 0
				}
			}
		}
	}
	
	override def toString = hours + ":" + minutes + ":" + seconds 
}

object SecondCounter {
   def apply() = new SecondCounter
}