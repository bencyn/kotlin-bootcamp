package example.myapp.decor

data class Decoration (val rocks: String) {

}
data class Decoration2 (val rocks: String, val wood:String, val diver:String){}

fun makeDecorations(){
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1 == decoration2)
    println(decoration2 == decoration3)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
//  destructuring Assign all properties to variables
    val (rock,wood,diver) = d5
//    val (rock,_,diver) = d5
    println(rock)
    println(wood)
    println(diver)

}


fun main(args:Array<String>){
    makeDecorations()
}