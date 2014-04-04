object Tehtavat extends App {
  	println("***************A*************")
  
	val lista = for (i <- 1 to 5; j <- i to 5; if i*j%2 != 0) yield(i*j)
	println(lista)
	lista.foreach(println)
	
/*
tulostuu:
1
3
5
9
15
25

Tässä käytetään siis kahta sisäkkäistä for-looppia, jossa i käy läpi välin 1-5 ja j käy jokaisen i:n kohdalla
läpi välin i-5 eli ensin (1-5), sitten seuraavan i:n kohdalla (2-5) jne.
Jos i*j ei ole parillinen, niin i*j-laskutoimituksen tulos lisätään jonoon.
//materiaalista:
Kirjoittamalla for-otsakkeen jälkeen ilmaus yield arvo, syntyy jono arvoja (Vector-olio), joita voi sitten käyttää muissa operaatioissa:
*/

	
	println
	println("***************B*************")
	val l = List(1,2,3,4,5)
	val m = Array(5,6,7,8,9)
	var a = 0; var b = 0
	l.foreach(x => {m(b)+=x; b+=1})
	//println("a "+a)
	//println("b "+b)
	m.foreach(println _)
	

/*
tulostuu:
6
8
10
12
14

l:n foreachin kohdalla muuttuja x saa jokaisella kierroksella arvokseen l:n indeksin elementin arvon,
eli ensimmäisellä kierroksella x=1, sitten x=2 jne.
b:n arvoa kasvatetaan yhdellä jokaisella kierroksella, eli ensimmäisellä kierrokseslla b=0, sitten b=1 jne.
x:n arvo lisätään taulukon m indeksin b sisältämään arvoon, eli ensimmäisellä kierroksella
x=1, b=0, m(0)+=1 eli m(0)=5+1=6 ja b=0+1=1 jne.

Lopuksi taulukon m alkioiden arvot tulostetaan käyttäen hyväksi placholderia
 */
	
	println
	println("***************C*************")
	val aa=1; val bb=2; val c=3;
	{ val bb=4; val c=5; //peitetään vanhat bb ja c näkyvistä
		{ val c=6; //peitetään ylempi c näkyvistä
		  println(aa +"/"+ bb +"/"+ c); //1/4/6
		}
		println(aa +"/"+ bb +"/"+ c); //1/4/5
	}
	println(aa +"/"+ bb +"/"+ c) //1/2/3
	
/*
tulostuu:
1/4/6
1/4/5
1/2/3

aina lähimmän muuttujan arvo tulostetaan, eli jos on peitetty näkyvistä muuttuja aa saman nimisellä
muuttujalla, niin käytetään tätä uutta muuttujaa ja sen arvoa
 */
	
	println
	println("***************D*************")
	//Tee seuraavalle funktiolle Curry-muunnos funktiona g:
	//Selitä, mistä on kysymys ja anna myös esimerkit f:n ja g:n kutsusta.
	def f(n: String, i: Int)  {println(n + ": " + i)}
	
	def g(n: String)(i: Int) {println(n + ": " + i)}
	
	f("testi", 10)
	g("testi")(10)
	
/*
 * eli muutetaan 2-parametrinen f kahdeksi 1-parametriseksi funktioksi.
 * g:tä pitää kutsua tavalla g("a")(1), g("a", 1) ei toimisi
 */
	
	
	
	
}