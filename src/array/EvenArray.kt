package array

/*
fun main(args: Array<String>){
    val arr = arrayOf<Int>(1,4,6,7,8,99,12,3,23)
    displayEven(arr)
}

fun displayEven(arr:Array<Int>){
    println("Even num in an array")
    for(i in arr.indices){
        if(arr[i] % 2 == 0)
            println(arr[i])
    }
}*/

fun main (args: Array<String>){

    val arr = IntArray(5)
    for(i in arr.indices){
        print("Enter an element")
        arr[i] = readLine()!!.toInt()
    }
    displayEven(arr)

}

fun displayEven(arr: IntArray) {
    println("Even num in an array")
    for(i in arr.indices){
        if(arr[i] % 2 == 0)
            println(arr[i])
    }

}
