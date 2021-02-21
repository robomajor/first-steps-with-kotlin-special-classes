enum class Color(val rgb: Int) {            //Defines an enum class with a property and a method.
    RED(0xFF0000),                     //Each instance must pass an argument for the constructor parameter.
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  //Enum class members are separated from the
                                                        // instance definitions by a semicolon.
}