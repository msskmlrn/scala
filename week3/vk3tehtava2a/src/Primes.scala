class Primes {

	def isPrime (x: Int) = {
		var res = true
		for (i <- 2 to (x - 1)) {
			if (x % i == 0) res = false
		}
		res
	}
	
	def prime1 (n: Int) = {
		var list: List[Int] = Nil
		var i = 2
		while (list.length < n) {
			if (isPrime(i)) {
				list = (i :: list)
			}
			i += 1
		}
		list.reverse
	}
	
	def prime2 (upperLimit: Int) = prime3(2, upperLimit)
	
	def prime3 (lowerLimit: Int, upperLimit: Int) = {
		var list: List[Int] = Nil
		var i = lowerLimit
		while (i < upperLimit) {
			if (isPrime(i)) {
				list = (i :: list)
			}
			i += 1
		}
		list.reverse
	}
}