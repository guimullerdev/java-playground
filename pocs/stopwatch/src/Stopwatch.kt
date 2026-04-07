class Stopwatch {
    private var startTime = 0L
    private var elapsed   = 0L
    private var isRunning = false

    val currentTime get() = if (isRunning) elapsed + (System.currentTimeMillis() - startTime) else elapsed
    val running     get() = isRunning

    fun start() {
        if (isRunning) return
        startTime = System.currentTimeMillis()
        isRunning = true
    }

    fun pause() {
        if (!isRunning) return
        elapsed  += System.currentTimeMillis() - startTime
        isRunning = false
    }

    fun reset() {
        elapsed   = 0L
        startTime = 0L
        isRunning = false
    }
}