open class Airplane (val brand: String, val year: Int, val count: Int) {

    open fun printInfo() = println(brand)

}

class Airbus(countPlanes: Int): Airplane("Airbus", 1970, countPlanes) {

    override fun printInfo() = println("Brand: $brand, year: $year, count: $count")

}

class Boeing(private val isConcurrent: Boolean, countPlanes: Int) : Airplane("Boeing", 1916, countPlanes) {

    override fun printInfo() = println("Brand: $brand, year: $year, is concurrent: ${ if (isConcurrent) "yes" else "no"}")

}

fun main(args: Array<String>) {
    val planes = listOf(Airbus(12), Boeing(false, 3))
    for (plane in planes) {
        plane.printInfo()
    }
}