import java.util.Scanner

fun main (args : Array<String>) {
    val inp = Scanner(System.`in`)
    print("Enter the value of a - ")
    var a : Int = inp.nextInt()
    var res : Int
    var b : Int
    print("Enter the value of b - ")
    b = inp.nextInt();

    var Op : Char
    print("Enter the operation you want - ")
    Op = inp.next().single()

    if (Op == '+') {
        res = a+b
        print("$res")
    } else if (Op == '-') {
        res = a-b
        print("$res")
    } else if (Op == '*') {
        res = a*b
        print("$res")
    } else if (Op == '/') {
        res = a/b
        print("$res")
    } else {
        print("This is not a operation for ${a} and ${b}")
    }
}