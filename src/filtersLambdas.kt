val decorations = listOf("rock","pagoda","plastic plant","alligator", "flowerpot")

val lazyMap = decorations.asSequence().map{
    println("access: $it")
    it
}
//val waterFilter: (Int) -> Int = {dirty -> dirty/2}
var dirtyLevel =20
val waterFilters = {dirty : Int -> dirty /2}

fun updateDirty(dirty:Int, operation:(Int) ->Int):Int {
    return operation(dirty)
}


val waterFilter:(Int) -> Int = {dirty-> dirty/2}
fun increaseDirty(start:Int) = start+1

//var dirtyLevel = 19;
//dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
//println(dirtyLevel)

fun main(){
    println(decorations.filter{it[0]=='p'})
    println("lazy: $lazyMap")
    println("------")
    println("first: ${lazyMap.first()}")
    println("-------")
    println("all: ${lazyMap.toList()}")

//    println(waterFilters(dirtyLevel))
    println(updateDirty(30,waterFilter))
    println(updateDirty(15,::increaseDirty))
}

//

