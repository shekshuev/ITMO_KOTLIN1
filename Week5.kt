import java.util.*

// Task 1
//fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    print("Input amount: ")
//    when (scanner.nextInt()) {
//        in 0..499 -> println(false)
//        in 500..1500 -> println(true)
//        else -> println("You can buy anything else")
//    }
//}

// Task 2
//fun main(args: Array<String>) {
//    val random = 3
//    print("Enter a number: ")
//    val reader = Scanner(System.`in`)
//    while (reader.nextInt() != 3) {
//        println("Ooops! Try again")
//    }
//    println("Yes!")
//}

// Task 3
//fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    val x = scanner.nextInt()
//    val y = scanner.nextInt()
//    val z = scanner.nextInt()
//    println(sum(x, y, z))
//}
//
//fun sum(x: Int, y: Int, z: Int) = x + y == z

// Task 4
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val z = scanner.nextInt()
    println(mult(x, y, z))
}

fun mult(x: Int, y: Int, z: Int) = x * y * z
