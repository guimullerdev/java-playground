fun main() {
    val manager = TaskManager()

    while (true) {
        println("\n--- TO-DO LIST ---")
        println("1. Listar todas")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()?.trim()) {
            "1" -> manager.listAll()
            "0" -> { println("Até mais!"); break }
            else -> println("Opção inválida.")
        }
    }
}