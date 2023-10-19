fun main(){

    var n : Int =9

    println(findMin(n))

}

fun findMin(n:Int) : Int{

    var res : Int = 0

    var num : Int = n;

    while(num>0){

    if( num and 1 == 0 ) {
        num /= 2
    }else{
        num--
    }
        res++

    }

    return res

}
