fun main (args:Array<String>) {
    var a:Int = readln().toInt()
    var b:Int = readln().toInt()

    var res = add(a,b)
    print(res)
}
fun add (a:Int, b:Int) : Int {
    return a+b
}