import kotlin.math.abs

fun main(args: Array<String>) {
    prefix(3, 5,7,9, prefix="number")
}

fun symbols() {
    for (letter in 'a'..'f') {
        println(letter)
    }
}

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

fun compareIntegersAbs(a: Int, b: Int, absolute: Boolean = false): String {
    return if (absolute) {
        if (abs(a) < abs(b)) "abs(a) < abs(b)" else if (abs(a) == abs(b)) "abs(a) == abs(b)" else "abs(a) > abs(b)";
    } else {
        if (a < b) "a < b" else if (a == b) "a == b" else "a > b";
    }
}

fun prefix(vararg numbers: Int, prefix: String) {
    for (i in numbers) {
        println("$prefix: $i")
    }
}