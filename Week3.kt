import java.util.Scanner

fun main(args: Array<String>) {
    sortArray()
}

fun fun1(str: String?) {
    println(str?.length ?: "Str is null")
}

fun generateArray() {
    val scanner = Scanner(System.`in`)
    print("Input array size: ")
    val list = mutableListOf<Int>()
    for (i in 0..scanner.nextInt()) {
        print("Input value #${i+1}: ")
        list.add(scanner.nextInt())
    }
    println(list)
}

fun sortArray() {
    val array = listOf<Int>(5, -15, 100, -55, 20, -5, -80, 45, 25, -10)
    println(array.sorted())
}