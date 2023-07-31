fun main() {
    testWhen("Lola")
    testWhen(1)
    testWhen(50)
    testWhen(true)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        in 10..100 -> println("From ten to hundred")
        is String -> println("Length of string = ${input.length}")
        else -> println("I unno what is it!(")
    }
}