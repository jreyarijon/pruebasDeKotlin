fun main(){
    println("I'm learning :D")

    println(sum(2,3))

    printsum(5,2)

    rest(2,1)
}
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun printsum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}
fun rest(a:Int,b:Int)= a-b