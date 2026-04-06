fun main() {
    println("=== Password Generator ===\n")

    val length = readLength("Password length: ")

    val password = generatePassword(length)

    println("\nGenerated password: $password")
}

fun generatePassword(length: Int): String {
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val numbers = "0123456789"
    val specials = "!@#\$%^&*()-_=+[]{}|;:,.<>?"

    val characters = lowercase + uppercase + numbers + specials

    return (1..length).map { characters.random() }.joinToString("")
}

fun readLength(message: String): Int {
    println(message)
    val length = readLine()?.toIntOrNull();
    if (length != null && length >= 4) {
        return length
    }
    return readLength(message + "(ex: tamanho mínimo de 4)");
}