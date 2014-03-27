object FileExplorer extends App {
	var command = ""
	while (true) {
		print("kone> ")
		command = readLine
		parse(command)
	}
	
	def lo {
		sys.exit
	}
	
	def ls(matcher: String => Boolean) {
		val filesHere = ((new java.io.File(".")).listFiles toList) sorted
		
		for (file <- filesHere; if matcher(file.getName))
			println(file)
	}
	
	def parse(line: String) {
		val segments = line.split(' ')
		segments(0) match {
		  case "ls" => handleLs
		  case "lo" => lo
		  case _ => println("invalid command")
		}
		
		def handleLs() {
			if (segments.length == 1) {
				ls(_ => true)
			}
			else if (segments.length == 3) {
				handleLsParameter
			}
			else {
				println("invalid parameter")
			}
			
			def handleLsParameter {
				segments(1) match {
				  	case "-e" => ls(_.endsWith(segments(2)))
				    case "-b" => ls(_.startsWith(segments(2)))
				    case "-c" => ls(_.contains(segments(2)))
				    case _ => println("invalid parameter")
				}
			}
		}
	}
}