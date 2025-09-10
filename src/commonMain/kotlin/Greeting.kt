class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
    
    fun calculate(a: Int, b: Int): Int {
        return a + b
    }
    
    fun createMessage(name: String): String {
        return "Привет, $name! Это приложение работает на ${platform.name}"
    }
}