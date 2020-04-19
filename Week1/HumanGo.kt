class Human (var name: String) {
    fun battle(): String {
        return "$name use Fist Attack!"
    }
}

fun main(){
    var Person1 = Human("JohnCena")
    println(Person1.battle())
}