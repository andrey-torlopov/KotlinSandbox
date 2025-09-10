fun main() {
    val greeting = Greeting()
    
    println("=== Kotlin Multiplatform Terminal App ===")
    println(greeting.greet())
    println()
    
    println("Демо функций:")
    println("Сложение 5 + 3 = ${greeting.calculate(5, 3)}")
    println(greeting.createMessage("Андрей"))
    println()
    
    print("Введите ваше имя: ")
    val name = readLine() ?: "Гость"
    println(greeting.createMessage(name))
}