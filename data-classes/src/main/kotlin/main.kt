fun main() {
    val user = User("Alex", 1)
    println(user)                          //Method toString is auto-generated, which makes println output look nice.

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   //Auto-generated equals considers two instances equal if all their properties are equal.
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())                               //Equal data class instances have equal hashCode().
    println(secondUser.hashCode())

    // copy() function
    println(user.copy())                      //Auto-generated copy function makes it easy to create a new instance.
    println(user.copy("Max"))           //When copying, you can change values of certain properties. copy accepts
                                              // arguments in the same order as the class constructor.
    println(user.copy(id = 2))                //Use copy with named arguments to change the value despite of the
                                              // properties order.

    println("name = ${user.component1()}")          //Auto-generated componentN functions let you get
    println("id = ${user.component2()}")             // the values of properties in the order of declaration.


    val state = State.RUNNING                         //Accesses an enum instance via the class name.
    val message = when (state) {                      //With enums, the compiler can infer if a when-expression
        State.IDLE -> "It's idle"                       // is exhaustive so that you don't need the else-case.
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)                             //The default toString returns the name of the instance, here "RED".
    println(red.containsRed())               //Calls a method on an enum instance.
    println(Color.BLUE.containsRed())        //Calls a method via enum class name.
    println(red.rgb)

    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("John", "Board mover")))

    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber(90)
    d2.getNumber(90)

    rentPrice(10, 2, 1)

    DoAuth.takeParams("foo", "qwerty")

}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {  //Creates a function with parameters.

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

    BigBen.getBongs(12)

}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    companion object Bonger {                   //Defines a companion. Its name can be omitted.
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}