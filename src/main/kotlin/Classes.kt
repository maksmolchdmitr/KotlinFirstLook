fun main() {
    val child = Person("Vasya", 1, "Why not")
    val person1 = Person("Tom", 100, "Okay", child)
    println("Person = $person1")
    println("Child = ${person1.children}")
}

class Person(val name: String, val age: Int, var status: String) {
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created $name")
    }

    constructor(name: String, age: Int, status: String, child: Person) : this(name, age, status) {
        children.add(child)
    }
    constructor():this("NoName", 0, "Very Well")

    override fun toString(): String {
        return "Person(name='$name', age=$age, status='$status'" +
                "${if (children.isNotEmpty()) ", children=$children" else ""})"
    }
}