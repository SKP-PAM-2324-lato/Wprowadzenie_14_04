fun main() {

    val juiceCapacity = mapOf("apple" to 250, "banana" to 250, "orange" to 280 )
    println(juiceCapacity["apple"])

    val mutableJuiceCapacity = mutableMapOf("apple" to 250, "banana" to 250, "orange" to 280 )
    mutableJuiceCapacity["kiwi"] = 300
    println(mutableJuiceCapacity)

    for((key, value) in mutableJuiceCapacity) {
        println("$key -> $value")
    }

    println(mutableJuiceCapacity.containsKey("kiwi"))

    println(mutableJuiceCapacity["tomato"])

    // zdefiniuj mapę zawierającą pisownię cyfr np 1 to "jeden" poproś użytkownika o podanie cyfry i wyświetl ją słownie
}