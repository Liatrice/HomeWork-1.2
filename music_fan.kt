const val DISCOUNTMIN: UInt = 100_00u
const val DISCOUNT: Double = 0.05
const val MELOMAN: Double = 0.01
const val PRICE: UInt = 100_00u

fun main() {
    val minBuy: UInt = 1_000_00u
    val maxBay: UInt = 10_000_00u

    //Сначала нужно определить является ли пользователь меломаном и подсчитать предварительную сумму покупки (в копейках):
    val buyer: String = "meloman"
    val meloman = buyer == "meloman"
    val itemCount = readln().toUInt()
    var totalPrice: UInt = PRICE * itemCount / 100u

    //Затем сделать проверку на сумму покупки:
    var result = if (totalPrice > maxBay) {
        totalPrice - (totalPrice.toDouble() * DISCOUNT).toUInt()
    } else if (totalPrice >= minBuy) {
        totalPrice - DISCOUNTMIN
    } else {
        totalPrice
    }
    //Затем к полученной сумме уже применить скидку меломана, как описано в задании:
    if (meloman) {
        result - (result.toDouble() * MELOMAN).toUInt()
    } else {
        result
    }
    print("total price $result руб.")
}
