open class Humanz (var name: String, val mana: Int ) {
    open fun battle(): String {
        return "$name use Fist Attack!"
    }

    open fun manacheck() {
        if (mana - 5 > 0) {
            print("He still has mana")
        } else {
            print("He is out of mana")
        }
    }
}

class Mages(name: String, mana: Int) :Humanz(name,mana) {
    override fun battle(): String {
        return "$name use Fireball!"
    }

    override fun manacheck() {
        if (mana - 7 > 0) {
            print("He still has mana")
        } else {
            print("He is out of mana")
        }
    }
}
fun main(){
    var Person2 = Mages("HarryPotter",12)
    println(Person2.battle())
    Person2.manacheck() }