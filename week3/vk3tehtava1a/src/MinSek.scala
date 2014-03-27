class MinSek(min: Int, sec: Int) {
  
	private val totalSeconds = 60 * min + sec
	def minutes = totalSeconds / 60 abs
	def seconds = totalSeconds % 60 abs
  
	def this(seconds: Int) {
		this(0, seconds)
	}
	
	def this() {
		this(0)
	}
	
	def + (that: MinSek): MinSek = new MinSek(totalSeconds + that.totalSeconds)
	def - (that: MinSek): MinSek = new MinSek(totalSeconds - that.totalSeconds)
	
	def * (that: Int): MinSek = new MinSek(totalSeconds * that)
	def / (that: Int): MinSek = new MinSek(totalSeconds / that)

	def unary_- = new MinSek(-totalSeconds)
	
	override def toString = { (if (totalSeconds < 0) "-" else "") + minutes +
		":" + (if (seconds < 10) "0" + seconds else seconds) 
	}
}