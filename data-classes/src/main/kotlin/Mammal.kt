sealed class Mammal(val name: String)                                                   //Defines a sealed class.

class Cat(catName: String) : Mammal(catName)                                        //Defines subclasses.
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                 //Uses an instance of the sealed class as an argument in a when expression.
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    //A smartcast is performed, casting Mammal to Human.
        is Cat -> return "Hello ${mammal.name}"                                         //A smartcast is performed, casting Mammal to Cat.
    }          //The else-case is not necessary here since all possible subclasses of the sealed class are covered.
                // With a non-sealed superclass else would be required.
}