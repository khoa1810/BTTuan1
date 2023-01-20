fun triangle(a: Double, b: Double, c: Double): String {
//    val sides = listOf(a, b, c).sorted()
    if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
        if (a == b && b == c) {
            return "Equilateral triangle"
        } else if (a == b || a == c) {
            return "Isosceles triangle"
        } else {
            return "Scalene triangle"
        }
    } else if (b in a..c && a + b == c) {
        return "Degenerate triangle"
    } else {
        return "Not a triangle"
    }
}
fun main() {
    print("The length of side a: ")
    val a: Double = readLine()!!.toDouble()
    print("The length of side b: ")
    val b: Double = readLine()!!.toDouble()
    print("The length of side c: ")
    val c: Double = readLine()!!.toDouble()
    print("It's ${triangle(a, b, c)}")
}
