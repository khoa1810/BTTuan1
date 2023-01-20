import java.util.*
fun WordCount(text: String): Map<String, Int> =
    text.lowercase(Locale.getDefault())
        .split(Regex("[^a-zA-Z0-9']+"))
        .filter(String::isNotEmpty)
        .groupBy { it }.mapValues { it.value.size }
fun main() {
    print("Enter a phrase: ")
    val text: String = readLine()!!
    println(" ${WordCount(text)}")
}
