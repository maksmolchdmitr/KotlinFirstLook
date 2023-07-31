fun main(){
    val items = listOf("apple", "banana", "orange")
    for(item in items) println(item)
//    items.forEach(::println)

    var index = 0
    while (index<items.size) println("Item #$index = ${items[index++]}")

    println(3 in 1..10) // true
    for(num in 1..10) println(num) // [1;10]
    for(i in 0 until index) println("Index #$i") // [0;index)
    for(i in 10 downTo 1) println(i) //[10;1]
    for (i in 0..100 step 10) println(i) // 0, 10, 20,.., 100
}