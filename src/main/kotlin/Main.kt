fun main() {
    val likes = 21

   val result = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"

    print("Понравилось $likes $result")
}