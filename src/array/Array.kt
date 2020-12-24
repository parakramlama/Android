package array

//explicit type array-> if we declare the datatype of array
//val arr = arrayOf<Int>(1,2,3)

/*fun main(){
    //int[] arr = new Int[5]

    //implicit type array-> if the array contain integer the array type is integer
    val arr = arrayOf(1,2,3,4,6,7)
//    for(i in 0..arr.size-1){
//        println(arr[i])
//    }


//    for(i in 0 until arr.size){
//        println(arr[i])
//    }

    //new style of array i.e indices which is range of array
    for(i in arr.indices){
        println(arr[i])
    }

}

 */

//taking inputs and display them
fun main(){
    val arr = IntArray(5)
    for(i in arr.indices){
        print("Enter a element")
        arr[i] = readLine()!!.toInt()
    }
    println("Array elements are")
    for(i in arr.indices){
        println(arr[i])
    }
}
