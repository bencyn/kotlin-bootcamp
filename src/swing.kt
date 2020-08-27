fun swim(speed: String= "fast"){
    println("swimming $speed")
}


fun main(args:Array<String>){
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}