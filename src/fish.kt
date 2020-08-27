import java.util.*


fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun fishFood(day:String): String{

    return when (day){
        "Monday" -> "flakes"
        "Wednesday" -> "red-worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }

}
//fun shouldChangeWater(day:String, temperature:Int =22, dirty:Int=20): Boolean{
//    return when{
//        temperature > 30 -> true
//        dirty >30 -> true
//        else -> false
//    }
//}

//compact functions
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty:Int) = dirty >30
fun isSunday(day:String) = day == "Sunday"

fun shouldChangeWater(day:String, temperature:Int =22, dirty:Int=20): Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")

}
fun main(args:Array<String>){
    feedTheFish()
}