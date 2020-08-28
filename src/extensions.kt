fun main(args:Array<String>){
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")

//    val numbers = Triple(6,9,42)
//    println(numbers.toString())
//    println(numbers.toList())
//    destructuring
    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")

    val numbers = Triple(6,9,42)
    val (n1,n2,n3) = numbers
    println("$n1,$n2,$n3")

//    lists
    val list3 = listOf("a","bbb","cc")
    println(list3.sumBy { it.length })

    for (s in list3.listIterator()){
        println("$s ")
    }

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures.getOrDefault("bloating", "sorry , I don't know"))
    println(cures.getOrElse("bloating"){
        "no cure for this"
    })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())

}