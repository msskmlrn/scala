object Kirjasto {
  def summa(termi: (Int) => Double, lkm: Int) = {
    var s=0.0
    for (i <- 1 to lkm) s += termi(i)
    s
  }
}

/*
ensimmäinen kutsukerta: 
termi=harm(), lkm=4
s=0.0
for (1 to 4) eli
	s += harm(1), eli s = 0.0 + (1.0 / 1) eli s = 1.0
	s += harm(2), eli s = 1.0 + (1.0 / 2) eli s = 1.0 + 0.5 = 1.5
	s += harm(3), eli s = 1.5 + (1.0 / 3) eli s = 1.5 + 0.333... = 1,833333333
	s += harm(4), eli s = 1,833333333 + (1.0 / 4) eli s = 1,833333333 + 0.25 = 2,083333333


toinen kutsukerta:
termi=geom(), lkm=4
s=0.0
for (1 to 4) eli
	s += geom(1), eli s = 0.0 + (1.0 / (1 * 1)) eli s = 0.0 + 1.0 / 1 = 1.0
	s += geom(2), eli s = 1.0 + (1.0 / (2 * 2)) eli s = 1.0 + 1.0 / 4 = 1.0 + 0.25 = 1.25
	s += geom(3), eli s = 0.0 + (1.0 / (3 * 3)) eli s = 1.25 + 1.0 / 9 = 1.25 + 0,111111111 = 1,361111111
	s += geom(4), eli s = 0.0 + (1.0 / (4 * 4)) eli s = 1,361111111 + 1.0 / 16 = 1,361111111 + 0,0625 = 1,423611111


kolmas kutsukerta:
termi=_ + 0.5, lkm=4
s=0.0
for (1 to 4) eli
	s += 1 + 0.5, eli s = 0.0 + 1.5 = 1.5
	s += 2 + 0.5, eli s = 1.5 + 2.5 = 4.0
	s += 3 + 0.5, eli s = 4.0 + 3.5 = 7.5
	s += 4 + 0.5, eli s = 7.5 + 4.5 = 12.0
	
	
neljäs kutsukerta:
termi=(i: Int) = {laskuri+=1; laskuri}, lkm=4
laskuri=0.0, kuten Sovelluksessa on määritelty
s=0.0
for (1 to 4) eli
	s += termi(1), eli s = 0.0 + ({laskuri+=1; laskuri}), eli s = 0.0 + (laskuri = 0.0 + 1; 1.0), eli s = 0.0 + 1.0 = 1.0
	s += termi(2), eli s = 1.0 + ({laskuri+=1; laskuri}), eli s = 1.0 + (laskuri = 1.0 + 1; 2.0), eli s = 1.0 + 2.0 = 3.0
	s += termi(3), eli s = 3.0 + ({laskuri+=1; laskuri}), eli s = 3.0 + (laskuri = 2.0 + 1; 3.0), eli s = 3.0 + 3.0 = 6.0
	s += termi(4), eli s = 6.0 + ({laskuri+=1; laskuri}), eli s = 7.0 + (laskuri = 3.0 + 1; 4.0), eli s = 6.0 + 4.0 = 10.0
	
	

viides kutsukerta:
termi=f, lkm=4
var ed=1; var seur=1; var alussa=1, kuten Sovelluksessa on määritelty
s=0.0
for (1 to 4) eli
	s += f(1), eli s = 0.0 + f(1) = 0.0 + 1 = 1.0
	alussa = 1 + 1 = 2
	
	s += f(2), eli s = 1.0 + f(2) = 1.0 + 1 = 2.0
	alussa = 2 + 1 = 3
	
	s += f(3), eli s = 2.0 + f(3) = 2.0 + 2 = 4.0
	uus = 1 + 1 = 2, ed = 1, seur = 2
	
	s += f(4), eli s = 4.0 + f(4) = 4.0 + 3 = 7.0 
	uus = 1 + 2 = 3, ed = 2, seur = 3
	
*/