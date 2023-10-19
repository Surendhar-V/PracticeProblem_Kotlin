package Basics

fun main(){

    var res : Int = getMax(1 , 4)
    //println(res);

    //printMessage2(s1 = "Surendhar" )
    //println(sum(1,2,3,4,5,6,7,8,9))

    println(sum("surendhar" , 1,2,3,4,5,4.1));



}

fun getMax(a:Int , b:Int) = if(a>b) a else b

fun printMessage1(s1 : String  = "Suren" , s2 : String ) = println("Hello ${s1}, ${s2}")

fun printMessage2(s1 : String = "Suren" , s2 : String = greetings(s1)){
    println("${s2} , ${s1} ")
}

fun greetings(s:String) = "Hello ${s}"

fun sum(vararg elements: Any) : Int{

    var result : Int = 0;
    for(element in elements){
        if(element is Int ){
            result+=element
        }
    }
    return result

}

fun sum(vararg numbers: Int) :Int{
    var result = 0

//    for(number in numbers){
//        result+=number
//    }

    numbers.forEach { result += it }


    return result;
}