fun Long.formatTime(): String {
    val minutes      = (this / 60000) % 60
    val seconds      = (this / 1000) % 60
    val centiseconds = (this / 10) % 100
    return "%02d:%02d:%02d".format(minutes, seconds, centiseconds)
}

fun main() {
    val stopwatch = Stopwatch();

    println("=== Stopwatch ===");
    println("[Enter] play/pause");
    println();

    Thread {
        while (!Thread.interrupted()) {
            print("\r  ${stopwatch.currentTime.formatTime()}")
            System.out.flush()
            try {
                Thread.sleep(10)
            } catch (e: InterruptedException) {
                break
            }
        }
    }.also { it.isDaemon = true; it.start() }
}