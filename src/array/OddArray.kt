package array

/*
fun main(){
    val arr = arrayOf(1,4,6,7,8,99,12,3,23)
    displayOdd(arr)
}

fun displayOdd(arr: Array<Int>){
    for(i in arr.indices){
        if(arr[i] % 2 !==0)
            println(arr[i])
    }
}*/

fun main(){
    val arr = IntArray(5)
    for(i in arr.indices){
        print("Enter an element")
        arr[i] = readLine()!!.toInt()
    }
    displayOdd(arr)
}

fun displayOdd(arr: IntArray) {
    println("Enter num in an array")
    for(i in arr.indices){
        if(arr[i] % 2 !== 0)
            println(arr[i])
    }

}
