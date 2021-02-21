import java.util.Random

class LuckDispatcher {                    //Defines a blueprint.
    fun getNumber(bound: Int) {
        val objRandom = Random()
        println(objRandom.nextInt(bound))
    }
}