package Basics
//Only this is executing..
fun main(args: Array<String>){
    println("Hello from second main function")

    val integer : Int = 123;
    val double : Double = 1234.3;
    val float : Float = 2334.4f;
    val byte : Byte = 32;
   val boolean : Boolean = true;

    println(integer);
    println(double);
    println(float);
    println(byte);
    println(boolean);

    println(Int.MAX_VALUE);
    println(Byte.MAX_VALUE);

    var alarm :Int = 14;

    val a = when(alarm){

        12 -> print("This is twelve O clock")
        7 -> print("This is Seven O clock")
        1,2,3 -> print("Its is midnight")
        in 1..6-> println("Its great time to wake up")
        else -> print("You Better sleep permamantely")

    }
    println()
    println(a)



}