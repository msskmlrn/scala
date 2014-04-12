import swing._
import event._

object Calculator extends SimpleSwingApplication {
	def top = new MainFrame {
		title = "Aritmetiikka"

		object First extends TextField { columns = 5 }	// !!
		object Second extends TextField { columns = 5 }	// !!
		val result = new Label("Tulos: ")

		val PlusButton = new Button("+")
		val MinusButton = new Button("-")
		val MultiplyButton = new Button("*")
		val DivideButton = new Button("/")
		val EmptyFieldsButton = new Button("Tyhjennä kaikki kentät")
		val ExitButton = new Button("Lopeta")
				
		val inputPanel = new FlowPanel {
			contents += First
			contents += new Label(" 1. laskettava")
			contents += Second
			contents += new Label(" 2. laskettava")
		}
		
		val operationPanel = new FlowPanel {
			contents += PlusButton
			contents += MinusButton
			contents += MultiplyButton
			contents += DivideButton
			contents += EmptyFieldsButton
			contents += ExitButton
		}

		contents = new BoxPanel(Orientation.Vertical) {
			contents += inputPanel
			contents += operationPanel
			contents += result
			border = Swing.EmptyBorder(15, 10, 10, 10)
		}

		listenTo(First, Second, PlusButton, MinusButton, MultiplyButton, DivideButton, EmptyFieldsButton, ExitButton)

		reactions += {
			case ButtonClicked(b) => b.text match {
				case "+" => calculate((x, y) => x+y)
				case "-" => calculate((x, y) => x-y)
				case "*" => calculate((x, y) => x*y)
				case "/" => calculate((x, y) => x/y) //if y == 0, then auts
				case "Tyhjennä kaikki kentät" => {
					First.text = ""
					Second.text = ""
					result.text = ""
				}
				case "Lopeta" => sys.exit(0)
			}
		}
		
		def calculate(operation: (Double, Double) => Double) = {
			if (isNumber(First.text) && isNumber(Second.text)) {
				var m1 = parseNumber(First.text)
		  		var m2 = parseNumber(Second.text)
		  		result.text = (operation(m1, m2)).toString
			}
			else {
		  		result.text = "Tulos: " + " Virhe"
		  	}
		}
		
		def isNumber(s: String): Boolean = {
			try {
				s.toDouble
				true
			}
			catch {
			  	case e: NumberFormatException =>
			  	  	false
			}
		}
		
		def parseNumber(s: String): Double = {
			s.toDouble
		}
	}
}
