class TaskManager {
    private val tasks = mutableListOf(
        Task(id = 1, title = "Estudar Kotlin", priority = Priority.HIGH),
        Task(id = 2, title = "Fazer exercícios", priority = Priority.MEDIUM),
        Task(id = 3, title = "Ler um livro", priority = Priority.LOW),
        Task(id = 4, title = "Comprar café", priority = Priority.HIGH, isDone = true),
        Task(id = 5, title = "Organizar arquivos", priority = Priority.LOW, isDone = true)
    )

    fun listAll() {
        if (tasks.isEmpty()) { println("Nenhuma tarefa!"); return }
        tasks.forEach { task ->
            val status = if (task.isDone) "x" else " "
            println("[$status] #${task.id} - ${task.title} (${task.priority})")
        }
    }
}