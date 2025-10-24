class Car(brand: String, year: Int, val doors: Int):
    Vehicle(brand, year) {
    override fun displayInfo() {
        println("$brand, $year, $doors")
    }
}