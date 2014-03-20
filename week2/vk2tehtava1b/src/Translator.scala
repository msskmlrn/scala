import scala.io.Source
import scala.collection.mutable.Map

object Translator extends App {
	
	def checkParameter() {
		if (args.length == 0) {
			Console.err.println("Tiedostonimi puuttui, lopetetaan")
			sys.exit
		}
	}
  
	val wordMap = Map[String, String]()
	
	readWordsFromFile
	
	def readWordsFromFile() {
		var word = ""
		var i = 1
		for (line <- Source.fromFile(args(0)).getLines) {
			if (i % 2 == 0) wordMap += (word -> line)
			else word = line
			i += 1
		}
	}

	wordMap.foreach(println)
	println("Sanat opittu! (tyhjä kysymysrivi lopettaa)")
	
	var word = readLine
	
	while (word != "") {
		printTranslation(word)
		word = readLine
	}
	
	def printTranslation(word: String) {
		if (wordMap.contains(word)) println(wordMap(word))
		else println("VIRHE: En tunne sanaa "+word)
	}
}