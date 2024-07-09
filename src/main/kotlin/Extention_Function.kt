import java.util.Scanner

fun main (args:Array<String>) {
    val inp = Scanner(System.`in`)
    var x = inp.nextInt()
    println(x.isOdd())
}
fun Int.isOdd():Boolean {
    return (this%2==1)
}