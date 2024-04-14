import kotlin.random.Random

fun main() {

    // obstawianie
    val obstawione = mutableSetOf<Int>()

    while(obstawione.size < 6) {
        println("Podaj wartosc:")
        val liczba = readln().toInt()
        if(liczba < 1 || liczba > 49){
            continue
        }
        obstawione.add(liczba)
    }
    println(obstawione)

    // losowanie
    val wylosowane = mutableSetOf<Int>()
    while(wylosowane.size < 6) {
        wylosowane.add(Random.nextInt(1,50))
    }

    println(wylosowane)

    // sprawdzenie wyniku
    var wynik = 0
    for(liczba in obstawione){
        if(liczba in wylosowane){
            wynik++
        }
    }
    println("Twój wynik to $wynik")
}