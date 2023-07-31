fun main() {
    var a: String = "Hi"
//    a = null - Error
    var b: String? = "Ha"
    b = null
    println(a.length) // 2
    println(b?.length) // null
    //Elvis
    println("Size b = ${b?.length ?: 0}")
    b = if ((0..10).random() > 20) "Hello" else null
    println(b!!.length) // NPE
}