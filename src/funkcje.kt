import kotlin.math.PI
import kotlin.random.Random

fun main() {

    hello()
    hello()
    val wynik = addNumbers(2.0, 3.8)
    println(wynik)
    val pi = PI
    kotlin(5, "TEB")
    println(changeToSeconds("01:12:00"))
    println(rdn(0,10,10))
}

fun hello(){
    println("Hello kotlin")
    println("Hello world")
}

fun addNumbers(n1:Double, n2:Double): Double{
    return n1+n2
}

// Napisz funkcję która wyświetli tyle razy napis kotlin ile podano w argumencie
fun kotlin(n: Int, string: String){
     for(i in 1..n){
         println(string)
     }
}

//Napisz funkcję która obliczy obwód koła o podanym jako argument promieniu (2Pi*r)

// Napisz funkcja która zamienia czas podany w godzinach, minutach i sekundach na sekdundy
fun changeToSeconds(time:String): Int{
    //hh:mm:ss
    val data = time.split(":")
    var sec = 0
    if(data.size == 3){
        sec = data[0].toInt()*3600 + data[1].toInt()*60 + data[2].toInt()
    }
    return sec
}


// Napisz funkcja, która przyjmuje jako argument liczby min, max, n, a następnie zwraca listę która zawiera
// n loswych elementów z zakresu min-max
fun rdn(min:Int, max:Int, n:Int):MutableList<Int>{
   val list = mutableListOf<Int>()
   for(i in 1..n){
      list.add(Random.nextInt(min,max))
   }
   return list
}
