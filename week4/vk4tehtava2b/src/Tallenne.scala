class Tallenne(aika: Int, private val nimi: String) {
	private val kesto = new MinSek(aika)
	
	def getKesto = kesto
	def getNimi = nimi
	
	override def toString = kesto + " " + nimi
	
	override def equals(other : Any) : Boolean = other match {
    	case that : Tallenne => (
    		that.canEqual(this)
    		&& this.kesto == that.kesto
    		&& this.nimi == that.nimi
    	)
    	case _ => false
  }
	
	def canEqual(other : Any) : Boolean = other.isInstanceOf[Tallenne]
	
	override def hashCode = super.hashCode
}