package q5
import q4.Human

open class Mage(override val name: String): Human(name) {
    override fun attack() {
        println("$name use Fireball!")
    }
}


fun main(args: Array<String>) {
    val mage = Mage("Mage")
    mage.attack()
}