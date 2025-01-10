import androidx.compose.runtime.Composable
import androidx.compose.runtime.LockStats
import benchmarks.animation.AnimatedVisibility
import benchmarks.lazygrid.LazyGrid
import benchmarks.visualeffects.NYContent

fun runBenchmark(name: String, frameCount: Int, content: @Composable () -> Unit) {
    LockStats.clear()
    println("$name: " + measureComposable(frameCount, content))
    // println(androidx.compose.runtime.LockStats)
}

fun runBenchmarks() {
    runBenchmark("LazyGrid",2000) { LazyGrid() }
    runBenchmark("VisualEffects",1000) { NYContent() }
    runBenchmark("AnimatedVisibility", 1000000) { AnimatedVisibility() }
    runBenchmark("AnimatedVisibility", 1000000) { AnimatedVisibility() }
}