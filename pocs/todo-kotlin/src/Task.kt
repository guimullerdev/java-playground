enum class Priority { LOW, MEDIUM, HIGH }

data class Task(
    val id: Int,
    val title: String,
    val priority: Priority = Priority.MEDIUM,
    var isDone: Boolean = false
)