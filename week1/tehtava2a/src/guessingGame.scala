object guessingGame extends App {
  
	val generatedNum = (10*math.random).toInt

	println("Anna 1. arvaus: ");
	val guess1 = readInt
	println("Anna 2. arvaus: ");
	val guess2 = readInt
	println("Anna 3. arvaus: ");
	val guess3 = readInt

	var winnings = 0
	
	if (guess1 == generatedNum) winnings += 400
	if (guess2 == generatedNum) winnings += 200
	if (guess3 == generatedNum) winnings += 100
	
	if (winnings == 0) winnings = -100
	
	println("Arvottu luku oli: "+generatedNum + ", tuloksesi: "+winnings +" €")
}