const val MAX_VALUE = 0.0075
const val PRICE = 3500

fun main() {
    print("Введите сумму в копейках: ")
    val amount: Int = readln().toInt()
    val totalPrice =
        if (amount < PRICE) PRICE * 1.0
        else amount * MAX_VALUE
    print("Итоговая сумма комиссии составляет $totalPrice коп.")
}