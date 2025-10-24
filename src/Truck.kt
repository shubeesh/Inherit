class Truck(brand: String, year: Int, val payLoadCapacity: Double):
    Vehicle(brand, year) {

    override fun displayInfo() {
        println("$brand, $year, $payLoadCapacity")
    }


}