fun main() {
    val reader = System.`in`.bufferedReader()
    val units = DistanceUnit.entries

    println("=== Converter Distance ===\n")

    while (true) {
        println("From:")
        units.forEachIndexed { i, u -> println("${i + 1}. ${u.label}") }
        print("\nChoose: ")

        val fromInput = reader.readLine()?.trim() ?: continue

        val from = fromInput.toIntOrNull()?.minus(1)
            ?.let { units.getOrNull(it) }
            ?: run { println("Invalid option\n"); continue }

        println("\nTo:")
        units.forEachIndexed { i, u -> println("${i + 1}. ${u.label}") }
        print("Choose: ")

        val to = reader.readLine()?.trim()?.toIntOrNull()?.minus(1)
            ?.let { units.getOrNull(it) }
            ?: run { println("Invalid option\n"); continue }

        print("\nValue: ")
        val value = reader.readLine()?.trim()?.toDoubleOrNull()
            ?: run { println("Invalid value\n"); continue }

        val result = Converter.distance(value, from, to)

        println("\n$value ${from.label} = %.4f ${to.label}\n".format(result))
    }
}