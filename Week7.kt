class Parrot(_name: String, _age: Int) {

    val name: String = _name
        get() = field[0].titlecase() + field.substring(1)

    var age: Int = _age
        set(value) {
            if (value > 0) {
                field = value
            }
        }

}

class Plane(var places: Int, val year: Int, var model: String? = null)

class Car(val type: String, val brand: String, val year: Int)

fun main() {
    fun Car.info() = println("Type: $type, brand: $brand, year: $year")
    println(Car("SUV", "Nissan", 2016).info())
}