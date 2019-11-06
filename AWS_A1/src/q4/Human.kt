package q4

/***
 * In order to override human and "name", both are needed to mark as OPEN.
 * In Kotlin, classes are by default FINAL, which cannot be inherited.
 */
open class Human(open val name: String) {
    open fun attack() {
        println("$name use Fist Attack!")
    }
}


fun main(args: Array<String>) {
    val human = Human("Jason")
    human.attack()
}