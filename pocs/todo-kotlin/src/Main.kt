fun main() {
    val manager = TaskManager()

    while (true) {
        println("\n--- TO-DO LIST ---")
        println("1. Listar todas")
        println("2. Remover tarefa")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()?.trim()) {
            "1" -> manager.listAll()
            "2" -> {
                println("Digite o id da tarefa")
                var id = readLine()?.toIntOrNull();
                if(id != null) {
                    manager.delete(id);
                }
            }
            "0" -> { println("Até mais!"); break }
            else -> println("Opção inválida.")
        }
    }
}