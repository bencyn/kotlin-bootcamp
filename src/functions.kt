fun main(args:Array<String>){
//    println("Hello, ${args[0]}")
//    val isUnit = println("This is an expression")
//    println(isUnit)

    val temperature = 101
    val isHot = if (temperature > 50) true else false
    println(isHot)
    val message = "The water temperature is ${if (temperature > 50)" too warm" else "OK"}."
    println(message)
}