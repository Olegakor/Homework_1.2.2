fun main() {
    // Количество лайков
    val likes = 11

    val result = when {
        likes % 10 == 1 && likes % 100 != 11 -> "$likes человеку"
        likes % 10 in 2..4 && likes % 100 !in 12..14 -> "$likes людям"
        else -> "$likes людям"
    }

    println("Понравилось $result")
}
    