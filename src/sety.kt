fun main() {
    var fruits = setOf("Apple", "Banana", "Pear", "Grape", "Apple")
    println(fruits)
    println("Jest ${fruits.size} unikatowych owocow")

    println("Banana" in fruits)
    println("banana" in fruits)

    fruits = mutableSetOf("Apple", "Banana", "Pear", "Grape", "Apple")
    fruits.add("Pear")
    println(fruits)
}