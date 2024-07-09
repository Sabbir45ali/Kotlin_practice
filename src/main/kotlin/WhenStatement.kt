fun main(args : Array<String>) {
    var x = 90

    when (x) {
        10-> println("The value of x is 10")
        20-> println("The value of x is 20")
        90 -> {
            println("The value of x is 90")
            println("This is the main and real value of x")
        }
        else -> print("This is 404")
    }
}