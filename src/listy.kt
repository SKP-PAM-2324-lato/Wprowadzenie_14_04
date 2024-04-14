fun main() {

    // indeksy 0-3 ; [0, rozmiar-1]
    val countries = listOf("Germany", "Spain", "France", "Poland")
    println(countries)
    /*
    println(countries[0])
    println(countries[1])
    println(countries[2])
    println(countries[3])

     */
    for (country in countries) {
        println(country)
    }

    println("-------------------------")
    for (i in 0.. countries.size-1){
        println(countries[i])
    }
    println("-------------------------")
    // Wyświetl tylko te państwa, które są na parzystych indeksach (Germany, France)
    for (i in 0.. countries.size-1){
        if (i%2 == 0)
            println(countries[i])
    }

    println("-------------------------")
    for(i in 0..<countries.size step 2){
        println(countries[i])
    }

    // wyrażenie lambda
    countries.forEach{ it -> println(it)}

    val greenNumbers = listOf(1,4,23, 10, 21)
    val redNumbers = listOf(17,2, 5, 9)
    // ile łącznie elementów jest w obu listach?
    val numOfElements = greenNumbers.size + redNumbers.size
    // ile wynosi suma elementów w liście zielonej
    var sum = 0
    for(element in greenNumbers){
        sum += element
    }
    println(sum)
    println(greenNumbers.sum())
    // ile wynisi średnia elementów w liście czerwonej?
    println(redNumbers.sum()/redNumbers.size.toDouble())


    // lista modyfikowalna
    val shapes = mutableListOf("trojkat", "prostokat", "kwadrat")
    shapes[1] = "kolo"
    println(shapes)
    shapes.add("romb")
    shapes.remove("romb")
    println(shapes)


    // napisz program, który będzie wczytywał do listy liczby od użytkownika tak długo dopóki nie poda ona wartości -1.
    // Następnie program powinien wypisać ile liczb parzstych podał użytkownik
    /*
           - pętla while true z instrukcja break
           - pętla do while
           - for z if w środku

     */
    val number: MutableList<Int> = mutableListOf()
    while (true){
        val liczba: Int = readln().toInt()
        if(liczba == -1)
            break
        number.add(liczba)
    }
    println(number)

    var ileLiczb = 0
    for(liczba in number){
        if(liczba % 2 == 0)
            ileLiczb++
    }
    println(ileLiczb)


}