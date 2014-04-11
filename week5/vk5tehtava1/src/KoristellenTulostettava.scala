trait KoristellenTulostettava {
    def koristettava: String
    def koristemerkki: Char
    def reunusta = println(koristemerkki + koristettava + koristemerkki)
    
    def alleviivaa = println(koristettava + "\n" + viiva) 
    def ylleviivaa = println(viiva + "\n" + koristettava)
    def ymparoi = println(" " + viiva + " " + "\n" + "|" + koristettava + "|" + "\n" + " " + viiva + " ")
        
    private def viiva = "_" * koristettava.length

}