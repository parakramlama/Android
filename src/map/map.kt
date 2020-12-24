package map

/*
fun main(){
    //immutable map
    val StudentMarks = mapOf(
            "Riya" to 50,
            "kiran" to 34,
            "Salina" to 90
    )
    //print all the keys
    println("Keys are : ${StudentMarks.keys}")
    
    //print all the values
    println("Values are : ${StudentMarks.values}")

    //print the value on the basis of key
    println("Marks of Kiran is ${StudentMarks["kiran"]}")

    //taking student name to print marks
    print("Enter student name")
    val student = readLine()!!
    println("$student mark is ${StudentMarks[student]}")
}*/


fun main(){
    //mutable map
    val StudentMarksMutable = mutableMapOf(
            "Riya" to 50,
            "kiran" to 34,
            "Salina" to 90
    )
    //to add new student and marks
    StudentMarksMutable.put("dependra",50)
    StudentMarksMutable.put("abc",56)

    //print all the keys
    println("Keys are : ${StudentMarksMutable.keys}")

    //print all the values
    println("Values are : ${StudentMarksMutable.values}")

    //print the value on the basis of key
    println("Marks of Kiran is ${StudentMarksMutable["kiran"]}")

    //taking student name to print marks
    print("Enter student name")
    val student = readLine()!!
    println("$student mark is ${StudentMarksMutable[student]}")
}





