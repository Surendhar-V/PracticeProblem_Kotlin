package Basics

fun main() {
//    val names:Array<String> = arrayOf("surendhar" , "narendhar" , "mohana" , "venkatesan")
//    val mixedArr = arrayOf("surendhar" , 191201049 ,201201702.0)
//
//    names.forEach { println( it)  }
//    println()
//    names[0]= "suren"
//    names[1] = "naren"2
//    names.forEach { println(it) }
//    println()
//
//    for(element in mixedArr){
//
//        if(element is Int || element is Double)    println(element)
//
//    }

    var arr =Array(5 , {i-> i*1})
    var brr = Array(5 , {0})

    brr.forEach { println(it) }
    println()
    arr.forEach { println(it) }


}