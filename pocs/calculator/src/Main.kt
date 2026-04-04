fun Main() {
    val calculator = Calculator();

    while(true) {
        val input = readLine()?.trim()
        println("\n--- TO-DO LIST ---")
        println("1. Somar")
        println("2. Subatrair")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()?.trim()) {
            "1" -> {
                print("Numero 1: ")
                val number1 = input?.toInt()
                print("Numero 2: ")
                val number2 = input?.toInt()
                if (number1 != null && number2 != null) {
                    calculator.sum(number1, number2)
                }
            }
            "2" -> {

            }
            "0" -> { println("Até mais!"); break }
            else -> println("Opção inválida.")
        }
    }
}