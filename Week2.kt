import java.util.Arrays
import java.util.Scanner

fun main(args: Array<String>) {
    dayOfWeek()
}

fun variables() {
    val scanner = Scanner(System.`in`)
    print("Input your name: ")
    val name = scanner.nextLine()
    print("Input your age: ")
    val age = scanner.nextInt()
    println("Hello, $name! You are $age years old")
}

fun compareIntegers(a: Int, b: Int): String {
    return when {
        a > b -> ">"
        a < b -> "<"
        else -> "="
    }
}

fun multiplyThreeNumbers(a: Int, b: Int, c: Int) = a * b * c

fun getEvenNumber(a: Int, b: Int) = if (a % 2 == 0) a else if (b % 2 == 0) b else 0

fun dayOfWeek() {
    val scanner = Scanner(System.`in`)
    print("Input day of week number: ")
    when (scanner.nextInt()) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Outside of range")
    }
}