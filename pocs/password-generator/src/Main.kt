fun main() {
    println("=== Password Generator ===\n")

    val length = readLength("Password length: ")

    val password = generatePassword(length)

    println("\nGenerated password: $password")
    println("Strength: ${password}")
}

fun generatePassword(length: Int): String {
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val numbers = "0123456789"
    val specials = "!@#\$%^&*()-_=+[]{}|;:,.<>?"

    return ""
}

fun readLength(message: String): Int {
    return 0
}