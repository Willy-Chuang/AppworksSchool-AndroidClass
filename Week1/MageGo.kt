open class Humans (var name: String)
{
    open fun battle(): String {
        return "$name use Fist Attack!"
    }
}

class Mage(name: String) :Humans(name) {
    override fun battle(): String {
        return "$name use Fireball!"
    }
}
fun main(){
    var Person2 = Mage("HarryPotter")
    println(Person2.battle())
}