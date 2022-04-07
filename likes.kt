fun main() {
    val likes = readln().toUInt()
    if (likes == 11u)
    print("Понравилось $likes людям")
    else if (likes % 10u == 1u)
    print("Понравилось $likes человеку")
    else print("Понравилось $likes людям")
}
