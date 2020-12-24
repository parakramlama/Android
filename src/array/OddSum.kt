package array

fun main(){
    val arr = arrayOf(1,4,6,7,8,99,12,3,23)
    displaySumOfOdd(arr)
}

fun displaySumOfOdd(arr: Array<Int>) {
    for(i in arr.indices){
        if(arr[i] % 2 == 1)
            println(arr[i])
    }

}
