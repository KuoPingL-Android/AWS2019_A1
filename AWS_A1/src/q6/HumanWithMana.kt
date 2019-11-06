package q6

/**
 * Question 6 :
 * add a flag to confirm the Human has mana or not
 *
 * */

open class Human(open val name: String) {
    open val hasMana: Boolean = false
    open fun attack() {
        println("$name use Fist Attack!")
    }
}

open class Mage(override val name: String): Human(name) {
    override val hasMana: Boolean = true
    override fun attack() {
        println("$name use Fireball!")
    }
}

fun main(args: Array<String>) {
    val human = Human("John Doe")
    println("Does ${human.name} has mana? ${human.hasMana}")

    println()

    val mage = Mage("Jane Doe")
    println("Does ${mage.name} has mana? ${mage.hasMana}")
}