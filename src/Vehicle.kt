open class Vehicle(val brand: String, val year: Int) {

    open fun displayInfo() {
        println("$brand, $year")
    }
}