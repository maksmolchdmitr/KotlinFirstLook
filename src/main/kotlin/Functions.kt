import java.util.*

fun main() {
    println(testSimple())
    println(testSimple(10, 33))
    println(testString(100))
    testNamedArguments(x = 1, z = 32, y = 4).forEach(::println)
    testDefaultArgs(2, 2)
    testDefaultArgs()
    testDefaultArgs(y = 3)
    val nums = intArrayOf(1, 2, 3, 4, 5)
    printEven(*nums, 6, 7, 8, 9)
}

//fun testSimple(): Int{
//    return 5+5
//}
fun testSimple(): Int = 5 + 5

//fun testSimple(x: Int, y: Int): Int = x+y
fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int) = "Number is $x"

fun testNamedArguments(x: Int, y: Int, z: Int) = listOf(x, y, z)

fun testDefaultArgs(x: Int = 0, y: Int = 0) {
    println("Sum = ${x + y}")
}

fun foo(name: String, number: Int = 300, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number
}

fun printEven(vararg nums: Int) = nums.forEach { num -> if (num % 2 == 0) println(num) }