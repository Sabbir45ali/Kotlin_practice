fun main (args:Array<String>) {
//    var list = listOf(4,"Sabbir","Ruksana","Azhar Ali","Akbari Khatun")
    var list = mutableListOf("Sabbir","Ruksana","Azhar Ali","Akbari Khatun") //This is mutable
    list.add(0,"Baccha")

    var count:Int = 0
//While Loop
//    while (count<list.size) {
//        println(list[count])
//        count++
//    }

    //For loop
    for (item in list ){
        println(item)
    }
}