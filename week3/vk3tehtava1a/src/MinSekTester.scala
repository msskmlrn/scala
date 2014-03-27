object MinSekTester extends App {
	// konstruointi ja negatiiviset parametrit
	var a = new MinSek(2,11)
	println(a)               // 2:11
	a = new MinSek(2,-11)
	println(a)               // 1:49
	a = new MinSek(-2,11)
	println(a)               // -1:49
	a = new MinSek(-2,-11)
	println(a)               // -2:11

	a = new MinSek(66)
	println(a)               // 1:06   Huom: sekunnit siis aina 2 numerolla!
	a = new MinSek
	println(a)               // 0:00
	println(new MinSek(-21)) // -0:21
	a = new MinSek(1,601)
	println(a)               // 11:01

	// infix operaatiot + ja - kahdelle MinSek-arvolle
	val b = new MinSek(2,45)
	val c = new MinSek(49)
	println(b + " ja " + c)  // 2:45 ja 0:49
	a = b + c
	println(a)               // 3:34
	println(b - c)           // 1:56
	println(c - b)           // -1:56
	println(b - c + a)       // 5:30
	println(b - a)           // -0:49

	// infix-operaatiot * ja / MinSek-arvolle ja kokonaisluvulle
	a = new MinSek(2,11)
	println(a)               // 2:11
	println(a * 2)           // 4:22
	println(a / 2)           // 1:05

	println(a * -2)           // -4:22
	println(a / -2)           // -1:05

	// prefix-operaatio - vastaluvun laskentaan
	println(-a)               // -2:11
	println(-(-a))            // 2:11
}