fun main() {
    val calculator = Calculator();

    while(true) {
        println("\n--- TO-DO LIST ---")
        println("1. Somar")
        println("2. Subatrair")
        println("3. Multiplicar")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()?.trim()) {
            "1" -> {
                print("Numero 1: ")
                val number1 = readLine()?.toIntOrNull()
                print("Numero 2: ")
                val number2 = readLine()?.toIntOrNull()
                if (number1 != null && number2 != null) {
                    println("Total: ${calculator.sum(number1, number2)}")
                }
            }
            "2" -> {
                print("Numero 1: ")
                val number1 = readLine()?.toIntOrNull()
                print("Numero 2: ")
                val number2 = readLine()?.toIntOrNull()
                if (number1 != null && number2 != null) {
                    println("Total: ${calculator.subtract(number1, number2)}")
                }
            }

            "2" -> {
                print("Numero 1: ")
                val number1 = readLine()?.toDoubleOrNull()
                print("Numero 2: ")
                val number2 = readLine()?.toDoubleOrNull()
                if (number1 != null && number2 != null) {
                    println("Total: ${calculator.multiply(number1, number2)}")
                }
            }
            "0" -> { println("Até mais!"); break }
            else -> println("Opção inválida.")
        }
    }
}