import scala.io.Source

object stringFinder extends App {
  
	if (args.length == 0) {
		Console.err.println("Tiedostonimi puuttui, lopetetaan")
		sys.exit
	}
	
	var searchTerm = getSearchTerm
	 
	while (searchTerm != "") {
		printResults(searchTerm)
		searchTerm = getSearchTerm
	}
	
	def getSearchTerm = {
		println("Anna hakusana: ");
		readLine
	}
	
	def printResults(search: String) {
		var i = 1
		for (line <- Source.fromFile(args(0)).getLines) {
			if (line.contains(searchTerm)) println(i + " " + line)
				i += 1
		}
	}
}