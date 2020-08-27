fun happyBirthday(name: String, age: Int): String {
    return "Happy ${age}th birthday, $name!"
}
fun main(){
    val numberOfFish = 0
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    val numbers = intArrayOf(1,2,3)

    val numbers3 = intArrayOf(4,5,6)
    val foo3 = numbers3 + numbers
    println(numbers3+numbers)


    val school = arrayOf("shark", "salmon","minnow")
    for (element in school){
        println(element + " ")
    }

    for ((index, element) in school.withIndex()){
        println("Item at $index is $element \n")
    }
//    Item at 0 is shark
//    Item at 1 is salmon
//    Item at 2 is minnow

    for(i in 3..6 step 3) print(i)


    var bubbles =0
    while (bubbles <50){
        bubbles++
    }
    println("$bubbles  bubbles in the water\n")


    do {
        bubbles --
    }while (bubbles >50)
    println("$bubbles  bubbles in the water\n")


    repeat(2){
        println("A fish is swimming")
    }
//    A fish is swimmingA fish is swimming
}
