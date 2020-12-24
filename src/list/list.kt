package list

/*fun main(){
    val lst = listOf("one","two","three")
    print(lst)
    for(i in lst.indices){
        println(lst.get(i))
    }
}*/


fun main(){
//    immutable list
    val lst = listOf("one","two","three")
    println("Mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
//    mutable list
    val mutableLst = mutableListOf("one","two","three")
    mutableLst.add("four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
}


//set
/*
fun main(){
    val numbers = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}*/
