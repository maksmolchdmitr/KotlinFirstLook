fun main() {
    val list = listOf(-1, -2, -3, 0, 1, 2, 3, 4, 5)
    println("Even numbers = ${list.filter { num -> num % 2 == 0 }}")
//    val sum = list.sum()
    val sum = list.reduce { sum, e -> sum + e }
    println("Sum of all elements = $sum")
    val mul = list.reduce { mul, e -> mul * e }
    println("Product of elements = $mul")
    println("${list.sortedByDescending { it }}")
    println("There is three = ${list.any { it == 3 }}")
    println("All elements bigger than -10 = ${list.all { it > -10 }}")
    val (pos, neg) = list.partition { it >= 0 }
    println("Positive = $pos and Negative = $neg")
    val words = listOf("Ha", "yeah", "go", "lola", "No Way", "I", "You", "A", "Thanks")
    println(words.groupBy { it.length })
}