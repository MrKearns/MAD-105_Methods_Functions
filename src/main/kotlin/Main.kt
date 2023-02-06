
// ---------- TRIANGLE ----------
fun triangle(b: Int, h: Int) : Double {
    var ans = (.5 * b) * h
    println("Area = $ans")
    return ans

}

// ---------- SQUARE ----------
fun square(a: Int): Int{
    var ans =a * a
    println("Area = $ans")
    return ans

}

// ---------- CIRCLE ----------
fun circle(r: Int): Double{
    var ans = 3.14159 * r * r
    println("Area = $ans")
    return ans

}

// ---------- PARALLELOGRAM ----------

fun parallelogram(b: Int, h: Int): Int{
    var ans =  b * h
    println("Area = $ans")
    return ans

}




// ---------- MAIN ----------
fun main(){
    println("What shape would you like to find the area of?")
    println("1 - Square")
    println("2 - Circle")
    println("3 - Triangle")
    println("4 - Parallogram")
    println("5 - Exit")

    var choice = readln().toInt()

    if (choice !in 1..5)
        println("not a valid choice")
    else
        when (choice){
            1 -> {
                println("Enter length of one side: ")
                var a = readln().toInt()
                square(a)
                main()
            }

            2 -> {
                println("Enter the radius: ")
                var r = readln().toInt()
                circle(r)
                main()
            }
            3 -> {
                println("Enter length of the base: ")
                var b = readln().toInt()

                println("Enter length of one height: ")
                var h = readln().toInt()

                triangle(b, h)
                main()

            }
            4 -> {
                println("Enter length of the base: ")
                var b = readln().toInt()

                println("Enter length of one height: ")
                var h = readln().toInt()

                parallelogram(b, h)
                main()
            }

            5 -> println("Goodbye")
        }
}
