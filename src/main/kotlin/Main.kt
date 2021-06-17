fun main() {
    val likes = 1

    val peopleString = if (likes == 11 || likes.toString().endsWith("11")) "людям"
    else if (likes == 1 || likes.toString().endsWith("1")) "человеку"
    else "людям"

    print("Понравилось $likes $peopleString")
}