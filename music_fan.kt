const val DISCOUNTMIN: UInt = 100_00u
const val DISCOUNT: Double = 0.05
const val MELOMAN: Double = 0.01
const val PRICE: UInt = 100_00u

fun main() {
    val minBuy: UInt = 1_000_00u
    val maxBay: UInt = 10_000_00u
    var buyer: String = "meloman"
    val itemCount = readln().toUInt()
    if (buyer == "meloman") {
        true
    } else {
        false
    }

    var totalPrice: UInt = (PRICE * itemCount) / 100u
    val result = if (totalPrice < minBuy) {
        totalPrice.toDouble()
    } else if (minBuy <= totalPrice) {
        totalPrice - DISCOUNTMIN
    } else if (totalPrice <= maxBay) {
        totalPrice - DISCOUNTMIN
    } else if (totalPrice > maxBay) {
        (totalPrice.toDouble() - totalPrice.toDouble() * DISCOUNT)
    } else {
        totalPrice.toDouble() - (totalPrice.toDouble() * DISCOUNT) * MELOMAN
    }
    print("total price $result руб.")
}
