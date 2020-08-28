package example.myapp

//abstract class AquariumFish:FishAction{
//     abstract val color: String
//    override fun eat() = println("yum")
//
//}
// Interface delegation
interface FishAction{
    fun eat()
}
interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus(fishColor: FishColor= GoldColor):FishAction by PrintingFishAction("eat algae"), FishColor by fishColor{

}


class Shark:FishAction, FishColor{
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

sealed class Seal
class Sealion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal):String{
    return when(seal){
        is Walrus -> "walrus"
        is Sealion -> "sea lion"
    }
}


